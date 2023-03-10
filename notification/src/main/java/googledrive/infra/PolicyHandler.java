package googledrive.infra;

import javax.naming.NameParser;

import javax.naming.NameParser;
import javax.transaction.Transactional;

import googledrive.config.kafka.KafkaProcessor;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;
import googledrive.domain.*;

@Service
@Transactional
public class PolicyHandler{
    
    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString){}

    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='FileUploaded'")
    public void wheneverFileUploaded_NotifyToUser(@Payload FileUploaded fileUploaded){

        FileUploaded event = fileUploaded;
        System.out.println("\n\n##### listener NotifyToUser : " + fileUploaded + "\n\n");


        // Comments // 
		// 

        // Sample Logic //

        

    }
    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='VideoProcessed'")
    public void wheneverVideoProcessed_NotifyToUser(@Payload VideoProcessed videoProcessed){

        VideoProcessed event = videoProcessed;
        System.out.println("\n\n##### listener NotifyToUser : " + videoProcessed + "\n\n");


        // Comments // 
		// 

        // Sample Logic //

        

    }

}


