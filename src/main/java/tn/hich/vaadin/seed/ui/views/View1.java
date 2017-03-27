package tn.hich.vaadin.seed.ui.views;

import javax.annotation.PostConstruct;

import com.vaadin.icons.VaadinIcons;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.spring.annotation.SpringView;
import com.vaadin.ui.VerticalLayout;

@SpringView(name=View1.VIEW_NAME)
public class View1 extends VerticalLayout implements View{
	
	public static final String VIEW_NAME = "view1";
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
