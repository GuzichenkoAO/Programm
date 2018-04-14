package com.guzichenko.programm.dao;

import com.guzichenko.programm.model.Contact;

public interface ContactDao {

    /**
     * Интерфейс описывающий основное поведение работы с различными вариантами долгострочного хранения данных.
     * (файловая система, БД и т.д.)
     */

    void saveContact(Contact contact);

    void removeContact();

    void showAll();
}
