package kodlama.io.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.io.hrms.entities.concretes.JobTitle;
									//ekleme cıkarma
public interface JobTitleDao extends JpaRepository<JobTitle, Integer>{

}
