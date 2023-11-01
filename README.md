If we were to create a Person class to allow account creation so people could sign up for events they were interested in, that class could include the following fields:

It would be an Entity so it would be captured in our database
private int id - the unique user ID with @ID and @GeneratedValue annotations; would include a getter
private String firstName - the user’s first name with @NotBlank and @Size; would include getter and setter
private String lastName - the user’s last name with @NotBlank and @Size; would include getter and setter
private String email - the user’s email with @NotBlank and @Email; would include a getter and setter; we would also use this as their username
private String password - the user’s password with @NotBlank and @Size; would include a getter and setter
private String verifyPassword - a second field to have the user re-enter their password to verify it; same as above

The Person class might also reference:
MyEvents - a class to show the person the events they signed up for, which would also be an @Entity
private List<Events> eventsAttending with a @Many-to-Many annotation - to store events the user wants to attend; would set getter and setters for this so the user could add (sign up for new) or remove (decide to not attend) events from the list

In addition, we would create:
EventAttendees - a class to show all attendees for a single event so you could have an attendee list for each event
private List<Event>eventAttendees with a @One-to-Many relationship to the Person class via the List<Events> eventsAttending and a One-to-One relationshp with the Event classwith a method to pull in the firstName, lastName and email for the attendees for a particular event using the eventId.
