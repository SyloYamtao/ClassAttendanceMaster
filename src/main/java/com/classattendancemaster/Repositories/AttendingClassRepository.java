package com.classattendancemaster.Repositories;

import com.classattendancemaster.Entities.AttendanceList;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Arges on 30.03.2017.
 */
public interface AttendingClassRepository extends CrudRepository<AttendanceList, Long> {
}
