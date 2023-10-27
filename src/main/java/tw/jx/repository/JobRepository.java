package tw.jx.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import tw.jx.bean.Job;

public interface JobRepository extends JpaRepository<Job, Integer> {

}
