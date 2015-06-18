package com.ejemplo.vaadin.admusuarios;

import org.hibernate.validator.constraints.impl.EmailValidator;

import com.ejemplo.vaadin.entidades.Usuario;
import com.vaadin.annotations.AutoGenerated;
import com.vaadin.ui.AbsoluteLayout;
import com.vaadin.ui.Button;
import com.vaadin.ui.CustomComponent;
import com.vaadin.ui.Form;
import com.vaadin.ui.Label;
import com.vaadin.ui.TextField;

public class UsuarioForm extends Form {

	/*- VaadinEditorProperties={"grid":"RegularGrid,20","showGrid":true,"snapToGrid":true,"snapToObject":true,"movingGuides":false,"snappingDistance":10} */

	//@AutoGenerated
	//private AbsoluteLayout //mainLayout;
	@AutoGenerated
	private Button btnInsertar;
	@AutoGenerated
	private Button btnReset;
	@AutoGenerated
	private TextField txtMierdaClave;
	@AutoGenerated
	private TextField txtMierdaCorreo;
	@AutoGenerated
	private TextField txtMierdaApellidos;
	@AutoGenerated
	private TextField txtMierdaNombre;
	@AutoGenerated
	private Label label_1;
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * The constructor should first build the main layout, set the
	 * composition root and then do any custom initialization.
	 *
	 * The constructor will not be automatically regenerated by the
	 * visual editor.
	 */
	public UsuarioForm() {
		
		// top-level component properties
		setWidth("100.0%");
		setHeight("100.0%");
		
		// label_1
		label_1 = new Label();
		label_1.setImmediate(false);
		label_1.setWidth("-1px");
		label_1.setHeight("-1px");
		label_1.setValue("Mierda de usuarios");
		//mainLayout.addComponent(label_1, "top:40.0px;left:120.0px;");
		
		// txtMierdaNombre
		txtMierdaNombre = new TextField();
		txtMierdaNombre.setCaption("Mierda Nombre");
		txtMierdaNombre.setImmediate(false);
		txtMierdaNombre.setWidth("-1px");
		txtMierdaNombre.setHeight("-1px");
		txtMierdaNombre.setRequired(true);
		txtMierdaNombre.setRequiredError("Debes escribir una mierda nombre");
		//mainLayout.addComponent(txtMierdaNombre, "top:116.0px;left:103.0px;");
		
		// txtMierdaApellidos
		txtMierdaApellidos = new TextField();
		txtMierdaApellidos.setCaption("Mierda Apellidos");
		txtMierdaApellidos.setImmediate(false);
		txtMierdaApellidos.setWidth("260px");
		txtMierdaApellidos.setHeight("-1px");
		txtMierdaApellidos.setRequired(true);
		txtMierdaApellidos.setRequiredError("Debes escribir una mierda de apellidos");
		//mainLayout.addComponent(txtMierdaApellidos, "top:116.0px;left:280.0px;");
		
		// txtMierdaCorreo
		txtMierdaCorreo = new TextField();
		txtMierdaCorreo.setCaption("Mierda Correo");
		txtMierdaCorreo.setImmediate(false);
		txtMierdaCorreo.setWidth("260px");
		txtMierdaCorreo.setHeight("-1px");
		txtMierdaCorreo.setRequired(true);		
		txtMierdaCorreo.addValidator(new com.vaadin.data.validator.EmailValidator("El mierda mail es no mail"));
		//mainLayout.addComponent(txtMierdaCorreo, "top:216.0px;left:100.0px;");
		
		// txtMierdaClave
		txtMierdaClave = new TextField();
		txtMierdaClave.setCaption("Mierda Clave");
		txtMierdaClave.setImmediate(false);
		txtMierdaClave.setWidth("-1px");
		txtMierdaClave.setHeight("-1px");
		txtMierdaClave.setRequired(true);
		txtMierdaClave.setRequiredError("Escribe la clave de mierda");
		//mainLayout.addComponent(txtMierdaClave, "top:216.0px;left:404.0px;");
		
		// btnReset
		btnReset = new Button();
		btnReset.setCaption("Limpiar Mierda");
		btnReset.setImmediate(false);
		btnReset.setWidth("-1px");
		btnReset.setHeight("-1px");
		//mainLayout.addComponent(btnReset, "top:294.0px;left:110.0px;");
		
		// btnInsertar
		btnInsertar = new Button();
		btnInsertar.setCaption("Insertar Mierda");
		btnInsertar.setImmediate(true);
		btnInsertar.setWidth("-1px");
		btnInsertar.setHeight("-1px");
		//mainLayout.addComponent(btnInsertar, "top:294.0px;left:300.0px;");
		
		addField("txtMierdaNombre",txtMierdaNombre);
		addField("txtMierdaApellidos",txtMierdaApellidos);
		addField("txtMierdaCorreo",txtMierdaCorreo);
		addField("txtMierdaClave",txtMierdaClave);
		addField("btnReset",btnReset);
		addField("btnInsertar",btnInsertar);
		
		//return //mainLayout;
	}

	public void entidadAFormulario(Usuario usuario) {
		// TODO Auto-generated method stub
		txtMierdaNombre.setValue(usuario.getNombres());
		txtMierdaApellidos.setValue(usuario.getApellidos());
		txtMierdaCorreo.setValue(usuario.getCorreo());
		txtMierdaClave.setValue(usuario.getClave());

	}
	
	public Usuario formularioAEntidad() {
		Usuario user = new Usuario();
		user.setApellidos(txtMierdaApellidos.toString());
		user.setNombres(txtMierdaApellidos.toString());
		user.setCorreo(txtMierdaCorreo.toString());
		user.setClave(txtMierdaClave.toString());
		return user;
	}

	public Button getBtnInsertar() {
		return btnInsertar;
	}

	public void setBtnInsertar(Button btnInsertar) {
		this.btnInsertar = btnInsertar;
	}

	public Button getBtnReset() {
		return btnReset;
	}

	public void setBtnReset(Button btnReset) {
		this.btnReset = btnReset;
	}

	public TextField getTxtMierdaClave() {
		return txtMierdaClave;
	}

	public void setTxtMierdaClave(TextField txtMierdaClave) {
		this.txtMierdaClave = txtMierdaClave;
	}

	public TextField getTxtMierdaCorreo() {
		return txtMierdaCorreo;
	}

	public void setTxtMierdaCorreo(TextField txtMierdaCorreo) {
		this.txtMierdaCorreo = txtMierdaCorreo;
	}

	public TextField getTxtMierdaApellidos() {
		return txtMierdaApellidos;
	}

	public void setTxtMierdaApellidos(TextField txtMierdaApellidos) {
		this.txtMierdaApellidos = txtMierdaApellidos;
	}

	public TextField getTxtMierdaNombre() {
		return txtMierdaNombre;
	}

	public void setTxtMierdaNombre(TextField txtMierdaNombre) {
		this.txtMierdaNombre = txtMierdaNombre;
	}

	public Label getLabel_1() {
		return label_1;
	}

	public void setLabel_1(Label label_1) {
		this.label_1 = label_1;
	}
	
	
}
