package com.example.application.services;

import com.example.application.data.Personel;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PersonelService {
    public List<Personel> getAllPersonel() {
        List<Personel> personelList = new ArrayList<>();

        String[][] names = {
                {"Ahmet", "Yılmaz"},
                {"Ayşe", "Kaya"},
                {"Mehmet", "Demir"},
                {"Fatma", "Çalık"},
                {"Ali", "Şahin"},
                {"Zeynep", "Korkmaz"},
                {"Hasan", "Aydın"},
                {"Emine", "Tekin"},
                {"Mustafa", "Öztürk"},
                {"Hülya", "Kara"}
        };

        for (int i = 0; i < names.length; i++) {
            Personel personel = new Personel();
            personel.setTc("TC" + (i + 1));
            personel.setName(names[i][0]);
            personel.setSurname(names[i][1]);
            personelList.add(personel);
        }

        return personelList;
    }
}