package io.asafarim.www.shoppinglist;

import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import org.primefaces.model.diagram.Connection;
import org.primefaces.model.diagram.DefaultDiagramModel;
import org.primefaces.model.diagram.DiagramModel;
import org.primefaces.model.diagram.Element;
import org.primefaces.model.diagram.endpoint.DotEndPoint;
import org.primefaces.model.diagram.endpoint.EndPointAnchor;

/**
 *
 * @author Ali
 */
@Named(value = "diagramBasicView")
@ViewScoped
public class BasicView implements Serializable{

    /**
     * Creates a new instance of BasicView
     */    
    private DefaultDiagramModel model;
 
    @PostConstruct
    public void init() {
        model = new DefaultDiagramModel();
        model.setMaxConnections(-1);
        model.setConnectionsDetachable(false);
         
        Element elementA = new Element("Cheese Name", "30em", "1em");
        elementA.addEndPoint(new DotEndPoint(EndPointAnchor.BOTTOM));
         
        Element elementB = new Element("Price", "10em", "15em");
        elementB.addEndPoint(new DotEndPoint(EndPointAnchor.CONTINUOUS_LEFT));
         
        Element elementC = new Element("Volume", "50em", "15em");
        elementC.addEndPoint(new DotEndPoint(EndPointAnchor.CONTINUOUS_RIGHT));
                         
        model.addElement(elementA);
        model.addElement(elementB);
        model.addElement(elementC);
         
        model.connect(new Connection(elementA.getEndPoints().get(0), elementB.getEndPoints().get(0)));        
        model.connect(new Connection(elementA.getEndPoints().get(0), elementC.getEndPoints().get(0)));
    }
     
    public DiagramModel getModel() {
        return model;
    }
}