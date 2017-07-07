
package com.blizzard.heatstone.api.swagger.api;

import java.util.Map;
import com.blizzard.heatstone.api.swagger.model.Card;

import io.swagger.annotations.*;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;


@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-07-07T15:53:17.778+08:00")

@Controller
public class CardsApiController implements CardsApi {

    public ResponseEntity<Map<String, Object>> insert(

@ApiParam(value = "卡牌" ,required=true ) @RequestBody Card card

) {
        // do some magic!
        return new ResponseEntity<Map<String, Object>>(HttpStatus.OK);
    }

}