package org.logviewer.controller;

import org.logviewer.request.SyncRequest;
import org.logviewer.response.SyncResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by philip on 27/5/17.
 */
@Controller
public class SyncController {

    @Autowired
    SyncService syncService;

    @ResponseBody
    @RequestMapping("/sync")
    public SyncResponse sync(SyncRequest request){
        return syncService.sync(request);
    }
}
