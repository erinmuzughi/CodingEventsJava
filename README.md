Purpose of the app: Create a single source that will allow LaunchCode students to submit CodingEvents that they know of either in their local area or virtually to create a single directory students can use to find useful coding related events to attend. 

Current state: Can be found on the many-to-many branch and details about the current functionality are below. 
This application currently enables outside users (with no login required) to:
- Create new event categories and tags
- Create new events by submitting a form on the page which automatically associates the event to a category (categories must be created first)
- Create new tags and add them to events after they are created. Multiple tags can be assigned to an event.
- View All Events and click into each event to get more details, add a new tag to an event from the details page
- View a list of All Categories and click into each category to see events associated with that category
- View All Tags; 
- The events, categories, tags and the associated relationships are stored as tables in a database. 
- Users can also delete events via the Delete Event Page

Future improvements:
- Add the ability to click a tag to view all events associated with that tag
- Add more fields to the event details page, including the date, time and location of the event
  
If we were to create a Person class to allow account creation so people could sign up for events they were interested in, that class could include the following fields:

It would be an Entity so it would be captured in our database and we would also set up a corresponding PersonRepository
- private int id - the unique user ID with @ID and @GeneratedValue annotations; would include a getter
- private String firstName - the user’s first name with @NotBlank and @Size; would include getter and setter
- private String lastName - the user’s last name with @NotBlank and @Size; would include getter and setter
- private String email - the user’s email with @NotBlank and @Email; would include a getter and setter; we would also use this as their username
- private String password - the user’s password with @NotBlank and @Size; would include a getter and setter
- private String verifyPassword - a second field to have the user re-enter their password to verify it; same as above

The Person class would have a @Many-to-Many relationship with Event via private List<Events> eventsAttending to store events the user wants to attend; 
- We would use getter and setters for this so the user could add (sign up for new) or remove (decide to not attend) events from the list

In addition, we would create:
EventPersonDTO - a data transfer object to hold Event and Person instances that we want to relate to each other, which will contain two fields:
@NotNull
   private Event event;

   @NotNull
   private Person person;
- each field is annotated with @NotNull because we will use this class in conjunction with model binding and form processing.

It will also contain:
- a no-arg constructor
- Getters and setters for the fields. 



