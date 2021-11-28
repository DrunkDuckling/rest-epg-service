package com.tv2.restepgservice;

import com.tv2.restepgservice.models.*;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class EpgController {

    @PostMapping(path = "/test")
    public Parentseries[] test(@RequestBody Epg epg){
        return epg.getParentserieslist();
    }

    @GetMapping(value = "/", produces = "text/plain")
    public String info(){
        return "List of endpoints: " + "\n" +
                "/channels : brings up the channels." + "\n" +
                "/programguide : brings up the programs sent on a given channel on a given day. Takes two params:" + "\n" +
                " - ?channelid= : the ID of the channel wanted" + "\n" +
                " - &date= : The date the programs is aired" + "\n" +
                "/program : holds multiple options. " + "\n" +
                " - Default : writing nothing provides the whole list of programs." + "\n" +
                " - ?program= : Write either the title or ext_id of program to provide the wanted show(s). " +
                "using the name can bring up multiple shows" + "\n" +
                "/serie : provides a given series wanted from the parent list: " + "\n" +
                " - ?serie= : Takes a name or id of the wanted series." + "\n" +
                "/serieslist : provides series from the serieslist; providing individuel series with additional information";
    }

    @PostMapping(path = "/full")
    public Epg full(@RequestBody Epg epg){
        return epg;
    }

    @PostMapping(path = "/channels")
    public Channel[] channels(@RequestBody Epg epg){
        return epg.getChannels();
    }

    // TODO
    @PostMapping(path = "/programguide")
    public Object programguiderecords(
            @RequestBody Epg epg,
            @RequestParam(value = "channelid", defaultValue = "null") String channelid,
            @RequestParam(value = "date", defaultValue = "null") String date){

        List<Programguiderecord> pgrlist = new ArrayList<>();

        if(channelid.equals("null") && date.equals("null") ) {
            return epg.getProgramguide();
        }

        for (Programguiderecord pgr : epg.getProgramguide().getProgramguiderecords()){
            if(pgr.getChn_id().equals(channelid) && pgr.getStart_timestamp_announced().contains(date)){
                pgrlist.add(pgr);
            }
        }

        if(pgrlist.isEmpty()){
            return "Input terms might be wrong or somthing went wrong";
        }
        return pgrlist;
    }

    @PostMapping(path = "/program")
    public Object program(
            @RequestBody Epg epg,
            @RequestParam(value = "program", defaultValue = "null") String program){

        // Empty list used to store programs in
        List<Program> programs = new ArrayList<>();

        // If the param is empty return all programs
        if(program.equals("null")) {
            return epg.getProgramlist();
        }

        // if param is either name or id of show return wanted programs
        for (Program pgm : epg.getProgramlist()){
            if(pgm.getTitle().equals(program)){
                System.out.println("name");
                programs.add(pgm);
            }
            if(pgm.getExt_id().equals(program)){
                System.out.println("id");
                return pgm;
            }
        }
        return programs;
    }

    // Same as Program process
    @PostMapping(path = "/serieslist")
    public Object serieslist(
            @RequestBody Epg epg,
            @RequestParam(value = "serie", defaultValue = "null") String serie){

        List<Series> series = new ArrayList<>();

        if(serie.equals("null")) {
            return epg.getSerieslist();
        }

        for (Series ser : epg.getSerieslist()){
            if(ser.getTitle().equals(serie)){
                System.out.println("name");
                series.add(ser);
            }
            if(ser.getExt_id().equals(serie)){
                System.out.println("id");
                return ser;
            }
        }
        return series;
    }

    @PostMapping(path = "/serie")
    public Object series(
            @RequestBody Epg epg,
            @RequestParam(value = "serie", defaultValue = "null") String serie){

        // bool used to determine if there was a match in the search
        boolean present = false;

        // empty param return all programs (Don't know what you're looking for?)
        if(serie.equals("null")) {
            return epg.getParentserieslist();
        }

        for (Parentseries ser : epg.getParentserieslist()){
            if(ser.getTitle().equals(serie) || ser.getExt_id().equals(serie)){
                present = true;
                return ser;
            }else {
                present = false;
            }
        }

        if(!present){
            return "Error: No match in file with input: " + serie;
        }else{
            return "Error: something went wrong:";
        }
    }
}
