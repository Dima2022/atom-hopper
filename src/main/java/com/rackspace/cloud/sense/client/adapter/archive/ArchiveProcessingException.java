/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rackspace.cloud.sense.client.adapter.archive;

/**
 *
 * @author zinic
 */
public class ArchiveProcessingException extends RuntimeException {

    public ArchiveProcessingException(String message, Throwable cause) {
        super(message, cause);
    }

    public ArchiveProcessingException(String message) {
        super(message);
    }
}
