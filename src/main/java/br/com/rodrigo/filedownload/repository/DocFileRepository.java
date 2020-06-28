package br.com.rodrigo.filedownload.repository;

import br.com.rodrigo.filedownload.dto.FileDocument;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DocFileRepository extends CrudRepository<FileDocument, Long> {

    FileDocument findByFileName(String fileName);
}
