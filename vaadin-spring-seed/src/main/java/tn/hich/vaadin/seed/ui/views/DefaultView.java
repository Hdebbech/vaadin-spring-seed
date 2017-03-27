package tn.hich.vaadin.seed.ui.views;

import javax.annotation.PostConstruct;

import com.vaadin.icons.VaadinIcons;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.spring.annotation.SpringView;
import com.vaadin.spring.annotation.UIScope;
import com.vaadin.ui.VerticalLayout;

@SpringView(name=DefaultView.VIEW_NAME)
@UIScope
public class DefaultView extends VerticalLayout implements View{
	
	public static final String VIEW_NAME = "default";
	public static final VaadinIcons ICON = VaadinIcons.DATABASE;
	
	@PostConstruct
	public void init(){
		setSizeFull();
	}
	
	

	/**
	 * 
	 */
	private static final long serialVersionUID = -5016028750375258991L;

	@Override
	public void enter(ViewChangeEvent event) {
		// TODO Auto-generated method stub
		
	}

}
