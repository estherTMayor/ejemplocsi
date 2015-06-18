package com.ejemplo.vaadin;

import com.ejemplo.vaadin.admusuarios.UsuarioForm;
import com.ejemplo.vaadin.entidades.Usuario;
import com.ejemplo.vaadin.servicios.ServicioUsuarios;
import com.vaadin.Application;
import com.vaadin.event.*;
import com.vaadin.*;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Button.ClickListener;
import com.vaadin.ui.Label;
import com.vaadin.ui.Window;
import com.vaadin.ui.Window.Notification;

import org.hibernate.validator.util.GetAnnotationParameter;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author javi
 * @version
 */
public class MyApplication extends Application implements ClickListener {
	private static final long serialVersionUID = 1539466153154709086L;
	UsuarioForm formUser = null;
	Button btnReset = null;
    Button btnInsertar = null;
	
	@Autowired
    ServicioUsuarios servicioUsuarios;

    @Override
    public void init() {
        Window mainWindow = new Window("Aplicacion");
        Label label = new Label("<h2>Ejemplo de Vaadin, Hibernate y Spring MVC/REST</h2>", Label.CONTENT_XHTML);
        mainWindow.addComponent(label);
        
        formUser = new UsuarioForm();
        
        btnReset = formUser.getBtnReset();
        btnInsertar = formUser.getBtnInsertar();
        
        btnReset.addListener(this);
        btnInsertar.addListener(this);
        
        mainWindow.addComponent(formUser);
        setMainWindow(mainWindow);
        
        
    }
    
	@Override
	public void buttonClick(ClickEvent event) {
		formUser.getWindow().showNotification("Boton puslao");

		if (event.getSource() == btnInsertar )
		{
			if(formUser.isValid())
			{
				Usuario usuario = formUser.formularioAEntidad();
				Integer respuesta = getServicioUsuarios().guardarUsuario(usuario);

				switch (respuesta.intValue()) {
				case 0:
					formUser.getWindow().showNotification("Todo de guay");
					break;
				case 1:
					formUser.getWindow().showNotification("Todo de mal");
					break;
				case 2:
					formUser.getWindow().showNotification("Todo de mal en permisios");
					break;
				case 4:
					formUser.getWindow().showNotification("Todo existente anterioremetente");
					break;
				default:
					formUser.getWindow().showNotification("Todo de forma defaulera");
					break;
				}									
			}

			else {
				formUser.getWindow().showNotification("Todo a rellenar bien");
			}
		}
		else
		{			
			Usuario usuario = formUser.formularioAEntidad();
			usuario.resetear();
			formUser.getTxtMierdaApellidos().setValue("");
			formUser.getTxtMierdaClave().setValue("");
			formUser.getTxtMierdaCorreo().setValue("");
			formUser.getTxtMierdaNombre().setValue("");		
			formUser.getBtnReset().setCaption("OYE QUE ME HAS BORRADO CABRON");
			formUser.getWindow().showNotification("Todo a borrar");			
		}
	}
    

    /**
     * Metodo que retorna el objeto injectado para que otras clases de la
     * aplicacion puedan usarlo
     *
     * @return El objeto ServicioUsuario injectado
     */
    public ServicioUsuarios getServicioUsuarios() {
        return servicioUsuarios;
    }



	
}
