package tn.hich.vaadin.seed.ui;

import org.springframework.beans.factory.annotation.Autowired;

import com.vaadin.annotations.Theme;
import com.vaadin.navigator.Navigator;
import com.vaadin.server.Responsive;
import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.spring.navigator.SpringViewProvider;
import com.vaadin.ui.Component;
import com.vaadin.ui.ComponentContainer;
import com.vaadin.ui.CssLayout;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.UI;
import com.vaadin.ui.themes.ValoTheme;

import tn.hich.vaadin.seed.ui.views.DefaultView;


@SpringUI(path="/")
@Theme("mytheme")
public class MainUI extends UI{
	
	
	@Autowired
	SpringViewProvider provider;
	
	private ComponentContainer viewContent;

    /**
	 * 
	 */
	private static final long serialVersionUID = -1021101578568903032L;

	@Override
    protected void init(VaadinRequest vaadinRequest) {
		Responsive.makeResponsive(this);
		addStyleName(ValoTheme.UI_WITH_MENU);
		setContent(mainView());
		Navigator nav = new Navigator(this, viewContent);
		nav.addProvider(provider);
		nav.addView("", DefaultView.class);
		setNavigator(nav);
    }
	
	private HorizontalLayout mainView() {
		HorizontalLayout layout = new HorizontalLayout();
		layout.setSizeFull();
		layout.addStyleName("mainview");
		Component a = new AppMenu();
		layout.addComponent(a);

		viewContent = new CssLayout();
		viewContent.addStyleName("view-content");
		viewContent.setSizeFull();

		layout.addComponent(viewContent);
		layout.setExpandRatio(viewContent, 1f);
		return layout;
	}

}
