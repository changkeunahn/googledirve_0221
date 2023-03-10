package googledrive.domain;

import googledrive.domain.FileUploaded;
import googledrive.DriveApplication;
import javax.persistence.*;
import java.util.List;
import lombok.Data;
import java.util.Date;


@Entity
@Table(name="File_table")
@Data

public class File  {


    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    
    
    
    
    private Long id;
    
    
    
    
    
    private String name;
    
    
    
    
    
    private String path;
    
    
    
    
    
    private String filetype;
    
    
    
    
    
    private Long filesize;
    
    
    
    
    
    private String fileowner;
    
    
    
    
    
    private String url;

    @PostPersist
    public void onPostPersist(){


        FileUploaded fileUploaded = new FileUploaded(this);
        fileUploaded.publishAfterCommit();

    }

    public static FileRepository repository(){
        FileRepository fileRepository = DriveApplication.applicationContext.getBean(FileRepository.class);
        return fileRepository;
    }






}
