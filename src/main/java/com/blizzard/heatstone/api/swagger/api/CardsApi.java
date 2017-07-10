
package com.blizzard.heatstone.api.swagger.api;

import java.util.Map;
import com.blizzard.heatstone.api.swagger.model.Card;

import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-07-10T17:59:31.658+08:00")

@Api(value = "cards", description = "the cards API")
public interface CardsApi {

    @ApiOperation(value = "insert card", notes = "insert new card entity", response = Object.class, responseContainer = "Map", tags={ "card", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = Object.class) })
    @RequestMapping(value = "/cards/",
        produces = { "application/xml", "application/json" }, 
        method = RequestMethod.POST)
    ResponseEntity<Map<String, Object>> insert(

@ApiParam(value = "卡牌" ,required=true ) @RequestBody Card card

);


    @ApiOperation(value = "根据主键查询卡牌详情", notes = "根据主键查询活动详情", response = Object.class, responseContainer = "Map", tags={ "card", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = Object.class) })
    @RequestMapping(value = "/cards/{id}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<Map<String, Object>> selectById(
@ApiParam(value = "卡牌id",required=true ) @PathVariable("id") Integer id


);

}