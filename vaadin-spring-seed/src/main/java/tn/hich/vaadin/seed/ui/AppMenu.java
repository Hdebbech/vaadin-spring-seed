package tn.hich.vaadin.seed.ui;

import com.vaadin.icons.VaadinIcons;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Button;
import com.vaadin.ui.Component;
import com.vaadin.ui.CssLayout;
import com.vaadin.ui.CustomComponent;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.UI;
import com.vaadin.ui.themes.ValoTheme;

import tn.hich.vaadin.seed.ui.views.View1;
import tn.hich.vaadin.seed.ui.views.View2;
import tn.hich.vaadin.seed.ui.views.View3;
import tn.hich.vaadin.seed.ui.views.View4;

public class AppMenu extends CustomComponent {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8117953805076834950L;

	public static final String ID = "myapp-menu";

	Button navButton1;
	Button navButton2;
	Button navButton3;
	Button navButton4;

	public AppMenu() {
		setPrimaryStyleName("valo-menu");
		setId(ID);
		setSizeUndefined();
		setCompositionRoot(buildContent());
	}

	private Component buildContent() {
		final CssLayout menuContent = new CssLayout();
		menuContent.addStyleName("sidebar");
		menuContent.addStyleName(ValoTheme.MENU_PART);
		menuContent.addStyleName(ValoTheme.MENU_PART_LARGE_ICONS);
		menuContent.addStyleName("no-vertical-drag-hints");
		menuContent.addStyleName("no-horizontal-drag-hints");
		menuContent.addStyleName(ValoTheme.MENUBAR_SMALL);
		menuContent.setWidth(null);
		menuContent.setHeight("100%");

		menuContent.addComponent(buildTitle());
		menuContent.addComponent(buildMenuItems());

		return menuContent;
	}

	private Component buildTitle() {
		Label logo = new Label("<strong>Vaadin</strong> App", com.vaadin.shared.ui.ContentMode.HTML);
		logo.setSizeUndefined();
		HorizontalLayout logoWrapper = new HorizontalLayout(logo);
		logoWrapper.setComponentAlignment(logo, Alignment.MIDDLE_CENTER);
		logoWrapper.addStyleName("valo-menu-title");
		return logoWrapper;
	}

	private Component buildMenuItems() {
		CssLayout menuItemsLayout = new CssLayout();
		menuItemsLayout.addStyleName("valo-menuitems");

		navButton1 = addItem(View1.VIEW_NAME, View1.ICON);
		navButton2 = addItem(View2.VIEW_NAME, View2.ICON);
		navButton3 = addItem(View3.VIEW_NAME, View3.ICON);
		navButton4 = addItem(View4.VIEW_NAME, View4.ICON);

		menuItemsLayout.addComponent(buildBadgeWrapper(navButton1, new Label()));
		menuItemsLayout.addComponent(buildBadgeWrapper(navButton2, new Label()));
		menuItemsLayout.addComponent(buildBadgeWrapper(navButton3, new Label()));
		menuItemsLayout.addComponent(buildBadgeWrapper(navButton4, new Label()));
		return menuItemsLayout;

	}

	private Button addItem(String caption, VaadinIcons icon) {
		Button gv = new Button();
		gv.setIcon(icon);
		gv.setPrimaryStyleName("valo-menu-item");
		gv.setCaption(caption);
		gv.addClickListener(c -> {
			UI.getCurrent().getNavigator().navigateTo(caption);
			clearSelectedStyleName();
			gv.addStyleName("selected");
		});
		return gv;
	}
	
	private void clearSelectedStyleName(){
		navButton1.removeStyleName("selected");
		navButton2.removeStyleName("selected");
		navButton3.removeStyleName("selected");
		navButton4.removeStyleName("selected");
	}

	private Component buildBadgeWrapper(final Component menuItemButton, final Component badgeLabel) {
		CssLayout dashboardWrapper = new CssLayout(menuItemButton);
		dashboardWrapper.addStyleName("badgewrapper");
		dashboardWrapper.addStyleName(ValoTheme.MENU_ITEM);
		badgeLabel.addStyleName(ValoTheme.MENU_BADGE);
		badgeLabel.setWidthUndefined();
		badgeLabel.setVisible(false);
		dashboardWrapper.addComponent(badgeLabel);
		return dashboardWrapper;
	}
}
