package com.tyss.assetmanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tyss.assetmanagement.dto.AssetAllocationBean;
import com.tyss.assetmanagement.dto.AssetBean;
import com.tyss.assetmanagement.dto.AssetRequestBean;
import com.tyss.assetmanagement.dto.EmployeeBean;
import com.tyss.assetmanagement.dto.Response;
import com.tyss.assetmanagement.dto.UserBean;
import com.tyss.assetmanagement.service.AssetService;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class AssetController {

	@Autowired
	private AssetService service;

	@PostMapping(path = "/addasset", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public Response addAsset(@RequestBody AssetBean asset) {
		Response response = new Response();
		if (service.addAsset(asset)) {
			response.setStatusCode(201);
			response.setMessage("success");
			response.setDescription("Data added to the database");
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription(" failed to add data to the database");
		}

		return response;

	}// end of addasset

	@GetMapping(path = "/getasset", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public Response getAsset() {

		Response response = new Response();
		List<AssetBean> bean = service.getAssetRequest();
		if (bean != null) {
			response.setStatusCode(201);
			response.setMessage("success");
			response.setDescription("Data found in the database");
			response.setAsset(bean);

		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("unable to find data ");
		}

		return response;

	}// end of getasset

	@PutMapping(path = "/modifyassest", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public Response modifyAsset(@RequestBody AssetBean assest) {

		Response response = new Response();
		if (service.modifyAsset(assest)) {
			response.setStatusCode(201);
			response.setMessage("sucess");
			response.setDescription("Data modified in the database");
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription(" failed to modify the data");
		}

		return response;

	}// end of modifyasset

	@PostMapping(path = "/addemployee", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public Response addEmployee(@RequestBody EmployeeBean bean) {

		Response response = new Response();
		try {
			if (service.addEmployee(bean)) {
				response.setStatusCode(201);
				response.setMessage("success");
				response.setDescription("Employee Data added to the database");
			} else {
				response.setStatusCode(401);
				response.setMessage("Failure");
				response.setDescription(" failed to add Employee data to the database");
			}
		} catch (Exception e) {
			e.printStackTrace();
			response.setMessage(e.getMessage());
		}

		return response;

	}// end of addasset

	@PostMapping(path = "/login", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public Response login(@RequestBody UserBean bean) {
		Response response = new Response();
		UserBean bean1 = service.login(bean);
		String usertype = bean1.getUserType();
		if (bean1 != null && bean1.getUserPassword().equals(bean.getUserPassword())) {
			response.setStatusCode(201);
			response.setMessage("success");
			response.setDescription("user data found in database");
			response.setUsertype(usertype);
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Invalid credentials");
		} // end of login

		return response;
	}

	@PostMapping(path = "/raiserequest", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public Response raiseRequest(@RequestBody AssetRequestBean assetRequest) {

		Response response = new Response();
		if (service.raiseRequest(assetRequest)) {
			response.setStatusCode(201);
			response.setMessage("success");
			response.setDescription("Data added to the database");
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription(" failed to add data to the database");
		}

		return response;
	}// end of raise request

	@GetMapping(path = "/getRequestAsset", // this belong to view request list of admin
			consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public Response getAllRequest() {

		Response response = new Response();
		List<AssetRequestBean> bean = service.getAllRequest();
		if (bean != null) {
			response.setStatusCode(201);
			response.setMessage("success");
			response.setDescription("Data found in the database");
			response.setAssetRequest(bean);

		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("unable to find data ");
		}

		return response;

	}// end of getasset

	@GetMapping(path = "/getmanager/{empId}", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public Response getManagerRequest(@PathVariable("empId") int empId) {
		Response response = new Response();
		List<AssetAllocationBean> bean = service.getManagerRequest(empId);
		if (bean != null) {
			response.setStatusCode(201);
			response.setMessage("success");
			response.setDescription("Data found in the database");
			response.setAssetAllocation(bean);

		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("unable to find data ");
		}

		return response;

	}// end of getManagerRequest

	@PostMapping(path = "/assetallocation", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public Response assetAllocation(@RequestBody AssetAllocationBean bean) {
		Response response = new Response();
		if (service.assetAllocation(bean)) {
			response.setStatusCode(201);
			response.setMessage("allocated");
		} else {
			response.setStatusCode(401);
			response.setMessage("unallocated");
		}
		return response;
	}
}
