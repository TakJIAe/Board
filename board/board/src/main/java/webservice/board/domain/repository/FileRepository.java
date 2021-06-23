package webservice.board.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import webservice.board.domain.entity.File;

public interface FileRepository extends JpaRepository<File, Long> {
}
