package com.iotek.dao;

import com.iotek.model.Resume;
import com.iotek.model.User;

import java.util.List;

public interface ResumeMapper {
    List<Resume> getDetailByUid(Resume resume);
    boolean addResume(Resume resume);
    boolean updateResume(Resume resume);
}
