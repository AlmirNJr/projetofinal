package rest;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.stefanini.projeto.model.Dono;
import com.stefanini.projeto.service.DonoService;

import model.Panela;
import service.PanelaService;

@Path("panela")
public class PanelaResource {

	@Inject
	private PanelaService panelaService;

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response findAll() {
		List<Panela> panelas = panelaService.findAll();

		if (panelas.isEmpty()) {
			return Response.ok().build();
		}

		return Response.ok(panelas).build();
	}

}
