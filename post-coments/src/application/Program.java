package application;

import entities.Comment;
import entities.Post;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Program {
    public static void main(String[] args) {

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        LocalDateTime moment = LocalDateTime.parse("09/09/2023 11:32:25", fmt1);

        Comment comment1 = new Comment("Have a nice trip");
        Comment comment2 = new Comment("Wow that's awesome!");

        Post post = new Post(moment,
                "Traveling to New Zealand",
                "I'm going to visit this wonderful country",
                12);

        post.addComment(comment1);
        post.addComment(comment2);

        System.out.println(post);

    }

}
