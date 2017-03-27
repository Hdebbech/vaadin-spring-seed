package tn.hich.vaadin.seed.ui.views;

import javax.annotation.PostConstruct;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.ui.VerticalLayout;

public class DefaultView extends VerticalLayout implements View{
	
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
