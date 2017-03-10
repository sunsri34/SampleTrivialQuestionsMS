package com.ms.trivia;



import java.util.Date;
import javax.ws.rs.core.Application;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Link;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;
//import com.deegeu.utilities.git.RepositoryUtils;

/**
 * JAX-RS application. Root path is /trivia
 *
 */
@ApplicationPath("/trivia")
@Path("")
public class TriviaApp extends Application {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getDirectory(@Context UriInfo uri) {
        Link selfLink = Link.fromUri(uri.getBaseUri())
                .rel("self").type(MediaType.APPLICATION_JSON)
                .build();
        Link questionsLink = Link.fromUri(uri.getBaseUri() + "questions")
                .rel("questions").type(MediaType.APPLICATION_JSON)
                .build();

        return Response.ok().lastModified(new Date()).location(uri.getRequestUri())
                .lastModified(new Date())
                .location(uri.getRequestUri())
                .links(selfLink, questionsLink)
                .build();
        //RepositoryUtils.getGitRepositoryState().getBuildVersion()
    }

}
