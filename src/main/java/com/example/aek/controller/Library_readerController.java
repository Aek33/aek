package com.example.aek.controller;

import com.example.aek.models.Library_reader;
import com.example.aek.service.Library_readerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Library_readerController {

    public Library_readerController(Library_readerService library_readerService) {
        this.library_readerService = library_readerService;
    }

    @RequestMapping(value = "/Library_readerStart")
    public String itWorks(){
        return "Контроллер работает";
    }
    @Autowired
    private Library_readerService library_readerService;

    @RequestMapping(value = "/l_readers", method = RequestMethod.GET)
    public List<Library_reader> getAlllibrary_readers() {
        return library_readerService.getAlllibrary_readers();
    }

    @RequestMapping(value = "/l_readers/{r_id}", method = RequestMethod.GET)
    public Library_reader getLibrary_readerId(@PathVariable Long r_id){
        return library_readerService.getLibrary_readerId(r_id);
    }

    @RequestMapping(value = "/l_readers/save", method = RequestMethod.POST)
    public void saveLibrary_reader(Library_reader library_reader){
        library_readerService.saveLibrary_reader(library_reader);
    }

    @RequestMapping(value = "/l_readers/delete/{r_id}", method = RequestMethod.DELETE)
    public void deleteLibrary_reader(@PathVariable Long r_id){
        library_readerService.deleteLibrary_reader(r_id);
    }
}
