package org.navalplanner.business.resources.services;

import org.navalplanner.business.common.exceptions.InstanceNotFoundException;
import org.navalplanner.business.resources.entities.Resource;

/**
 * Interface for the resource management service.
 * 
 * @author Fernando Bellas Permuy <fbellas@udc.es>
 *
 */
public interface ResourceService {
    
    /**
     * It updates or inserts the resource passed as a parameter. If the
     * resource is a composite resource, updating or inserting is cascaded to
     * the resources contained in it.
     */
    public void saveResource(Resource resource);
    
    public Resource findResource(Long resourceId) 
        throws InstanceNotFoundException;
    
    /**
     * It adds a resource to a resource group. It the resource already belongs 
     * to a resource group, the resource is moved to the new group.
     */
    public void addResourceToResourceGroup(Long resourceId, 
        Long resourceGroupId) throws InstanceNotFoundException;
    
    public int getResourceDailyCapacity(Long resourceId) 
        throws InstanceNotFoundException;
    
    /**
     * It removes a resource. If the resource is a composite resource, the 
     * resources contained in it are not removed.
     */
    public void removeResource(Long resourceId) 
        throws InstanceNotFoundException;

}
