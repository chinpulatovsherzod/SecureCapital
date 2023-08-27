package com.example.securecapital.repository;

import com.example.securecapital.model.User;

import java.util.Collection;

public interface UserReposiory <T extends User> {

    T create(T data);
    Collection<T> list(int page, int pageSize);
    T get(Long id);
    T update(T data);
    Boolean delete(Long id);
}
