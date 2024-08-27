package com.example.application.views.personel;

import com.example.application.data.Personel;
import com.example.application.services.PersonelService;
import com.example.application.views.MainLayout;
import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.dependency.Uses;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.data.provider.ListDataProvider;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@PageTitle("Personel")
@Route(value = "personel", layout = MainLayout.class)
@Uses(Icon.class)
public class PersonelView extends Composite<VerticalLayout> {

    private final PersonelService personelService;
    private Grid<Personel> grid;
    private ListDataProvider<Personel> dataProvider;

    @Autowired
    public PersonelView(PersonelService personelService) {
        this.personelService = personelService;
        initLayout();
    }

    private void initLayout() {
        grid = new Grid<>(Personel.class, false);
        grid.addColumn(Personel::getName).setHeader("Ad").setSortable(true);
        grid.addColumn(Personel::getSurname).setHeader("Soyad").setSortable(true);

        List<Personel> personelList = personelService.getAllPersonel();
        dataProvider = new ListDataProvider<>(personelList);
        grid.setDataProvider(dataProvider);

        TextField searchField = new TextField();
        searchField.setPlaceholder("Write + Enter");
        searchField.addValueChangeListener(event -> {
            String filter = event.getValue().trim().toLowerCase();
            if (filter.isEmpty()) {
                dataProvider.clearFilters();
            } else {
                dataProvider.setFilter(personel ->
                        personel.getName().toLowerCase().contains(filter));
            }
        });

        getContent().add(searchField, grid);
    }
}
