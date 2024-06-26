package insurance.domain;

import insurance.ReviewApplication;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Review_table")
@Data
//<<< DDD / Aggregate Root
public class Review {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    public static ReviewRepository repository() {
        ReviewRepository reviewRepository = ReviewApplication.applicationContext.getBean(
            ReviewRepository.class
        );
        return reviewRepository;
    }

    //<<< Clean Arch / Port Method
    public static void readyToReview(ClaimRequested claimRequested) {
        //implement business logic here:

        /** Example 1:  new item 
        Review review = new Review();
        repository().save(review);

        Reviewed reviewed = new Reviewed(review);
        reviewed.publishAfterCommit();
        */

        /** Example 2:  finding and process
        
        repository().findById(claimRequested.get???()).ifPresent(review->{
            
            review // do something
            repository().save(review);

            Reviewed reviewed = new Reviewed(review);
            reviewed.publishAfterCommit();

         });
        */

    }
    //>>> Clean Arch / Port Method

}
//>>> DDD / Aggregate Root
