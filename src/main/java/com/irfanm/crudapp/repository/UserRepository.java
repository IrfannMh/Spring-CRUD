package com.irfanm.crudapp.repository;

import com.irfanm.crudapp.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
//<nama model, type data id>
public interface UserRepository extends JpaRepository<User, Long> {
    void findById(String id);

    void deleteById(String id);
//    Bikin method baru kalau custom (select where...)
}
