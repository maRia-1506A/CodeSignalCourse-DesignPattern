// OBSERVER DP 

// TODO: Define the Subscriber interface with a method: void update(String movie)

// TODO: Define a private attribute 'name'.
// TODO: Implement the constructor to initialize the name.
// TODO: Implement the update method to print the subscriber's notification.

// TODO: Define the MoviePublisher interface with methods to add, remove, and notify subscribers.

// TODO: Define a private list of Subscribers.
// TODO: Implement the addSubscriber method.
// TODO: Implement the removeSubscriber method.
// TODO: Implement the notifySubscribers method.
// TODO: Implement the publishMovie method to simulate publishing a new movie.

// TODO: Create a MovieTopic instance.
// TODO: Create instances of MovieSubscriber for at least two subscribers.
// TODO: Add the subscribers to the MovieTopic instance.
// TODO: Publish new movies and observe the notifications.

import java.util.ArrayList;
import java.util.List;

public interface Subscriber {
    void update(String movie);

    public static void main(String[] args) {

        MovieTopic movieTopic = new MovieTopic();

        Subscriber sub1 = new MovieSubscriber("Alice");
        Subscriber sub2 = new MovieSubscriber("Bob");

        movieTopic.addSubscriber(sub1);
        movieTopic.addSubscriber(sub2);

        movieTopic.publishMovie("Avengers: Secret Wars");
        movieTopic.publishMovie("Spider-Man: Beyond the Spider-Verse");
    }

}

class MovieSubscriber implements Subscriber {

    private String name;

    public MovieSubscriber(String name) {
        this.name = name;
    }

    @Override
    public void update(String movie) {
        System.out.println(name + " received notification: New movie released - " + movie);
    }
}

interface MoviePublisher {
    void addSubscriber(Subscriber subscriber);

    void removeSubscriber(Subscriber subscriber);

    void notifySubscribers(String movie);
}

class MovieTopic implements MoviePublisher {

    private List<Subscriber> subscribers = new ArrayList<>();

    @Override
    public void addSubscriber(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    @Override
    public void removeSubscriber(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    @Override
    public void notifySubscribers(String movie) {
        for (Subscriber subscriber : subscribers) {
            subscriber.update(movie);
        }
    }

    public void publishMovie(String movie) {
        System.out.println("New movie released: " + movie);
        notifySubscribers(movie);
    }
}