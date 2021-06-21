package webservice.board.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import webservice.board.domain.entity.Board;

public interface BoardRepository extends JpaRepository<Board, Long> {
}
