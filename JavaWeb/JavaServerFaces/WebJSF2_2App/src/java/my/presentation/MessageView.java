package my.presentation;

import boundary.MessageFacade;
import entities.Message;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author Ali
 */
@Named(value = "MessageView")
@RequestScoped
public class MessageView {

    // Creates a new field
    private Message message;

    // Injects the MessageFacade session bean using the @EJB annotation
    @EJB
    private MessageFacade messageFacade;

    /**
     * Creates a new instance of MessageView
     */
    public MessageView() {
        this.message = new Message();
    }
    // Calls getMessage to retrieve the message

    public Message getMessage() {
        return message;
    }

    // Returns the total number of messages
    public int getNumberOfMessages() {
        return messageFacade.findAll().size();
    }

    // Saves the message and then returns the string "theend"
    public String postMessage() {
        this.messageFacade.create(message);
        return "theend";
    }
}
