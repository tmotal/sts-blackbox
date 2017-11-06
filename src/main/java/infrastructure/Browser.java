package infrastructure;

public interface Browser {

    /**
     * Open a dedicated Web-resource identified via its location.
     * @param uri Location of a dedicated Web-resource, e.g., Web-site
     */
    void goTo(String uri);

    /**
     * Close a browser window or tab.
     */
    void close();

    /**
     * Quit the browser
     */
    void quit();

}
