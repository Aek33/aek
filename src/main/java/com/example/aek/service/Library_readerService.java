package com.example.aek.service;

import com.example.aek.models.Book;
import com.example.aek.models.Library_reader;
import com.example.aek.repository.Library_readerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class Library_readerService {

    @Autowired
    private Library_readerRepository library_readerRepository;
    // найти все
    public List<Library_reader> getAlllibrary_readers(){
        List<Library_reader> library_readerList =new ArrayList<>();
        library_readerRepository.findAll().forEach(library_readerList::add);
        return library_readerList;
    }
    // найти по айди
    public Library_reader getLibrary_readerId(Long r_id) {
        Optional<Library_reader> optionalLibrary_reader = library_readerRepository.findById(r_id);
        return optionalLibrary_reader.orElse(null);
    }
    // сохранить
    public void saveLibrary_reader(Library_reader library_reader) {
        library_readerRepository.save(library_reader);
    }
    // удалить по айди
    public void deleteLibrary_reader(Long r_id){
        library_readerRepository.deleteById(r_id);
    }

}
