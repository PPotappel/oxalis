package eu.peppol.start.repository;

import eu.peppol.start.util.IdentifierName;
import org.w3c.dom.Document;

import java.util.Map;

/**
 * @author $Author$ (of last change)
 *         Created by
 *         User: steinar
 *         Date: 28.11.11
 *         Time: 20:55
 */
public interface MessageRepository {


    public void saveMessage(Map<IdentifierName,String> properties, Document document);
    
}
