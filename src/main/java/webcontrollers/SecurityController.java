package webcontrollers;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.inject.Named;

@Named
@SessionScoped
public class SecurityController implements Serializable {
	
	public String logOut(){
		FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
		return "index?faces-redirect=true";
	}
	
	public String getUserName() {
		ExternalContext ectx = FacesContext.getCurrentInstance()
				.getExternalContext();
		return ((ectx == null) || (ectx.getUserPrincipal() == null)) ? null
				: ectx.getUserPrincipal().getName();
	}

}