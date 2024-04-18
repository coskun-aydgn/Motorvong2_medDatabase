$(function () {
    hentbils();
})
function hentbils() {
    $.get("/hentbiler",function (data) {
        let biler=data;

        let ut = "<select id='valgtMerke' onchange='finnTyper()'>";
        let forrigeMerke = "";
        ut+="<option>Velg merke</option>";
        for (const bil of biler){
            if(bil.bilMerke !== forrigeMerke){
                ut+="<option>"+bil.bilMerke+"</option>";
            }
            forrigeMerke = bil.bilMerke;
        }
        ut+="</select>";
        $("#bilMerke").html(ut);
    })

}
function finnTyper(){
    const valgtMerke = $("#valgtMerke").val();
    $.get( "/hentbiler", function( biler ) {
        formaterTyper(biler,valgtMerke);
        console.log(biler);
        console.log(valgtMerke)
    });
}
function formaterTyper(biler,valgtMerke){
    let ut = "<select id='valgtType'>";
    for(const bil of biler ){

        if(bil.bilMerke === valgtMerke){
            ut+="<option>"+bil.bilType+"</option>";
            console.log(bil.biltype)
        }
    }
    ut+="</select>";
    $("#biltypeList").html(ut);
}
function regMotorvogn() {
    let personnr=$("#personnr").val();
    let navn=$("#eiersNavn").val();
    let adresse=$("#eiersAdresse").val();
    let kjennetegn=$("#kjennetegn").val();
    let bilmerke=$("#bilMerke").val();
    let biltype=$("#biltype").val();

    const liste={
        eierPersonNr:personnr,
        eiersNavn:navn,
        eiersAdresse:adresse,
        kjennetegn:kjennetegn,
        bilMerke:bilmerke,
        biltype:biltype
    }
    $.post("/add",liste, function (){})
    tablo();
}
function tablo() {
    let ut="";
    $.get("/hentalle",function (x){
        const alleMotorvongreg=x;
        console.log(alleMotorvongreg)
        ut+="<thead><tr><th>PersonNr</th><th>Navn</th><th>Adresse</th><th>Kjennetegn"+
            "</th><th>Bil Merke</th><th>Bil Type</th></tr></thead><tbody>";
        console.log(ut)
        for(let eier of alleMotorvongreg){
            ut+="<tr><td>"+eier.eierPersonNr+"</td><td>"+eier.eiersNavn+"</td><td>"+eier.eiersAdresse+
                "</td><td>"+eier.kjennetegn+"</td><td>"+eier.bilMerke+"</td><td>"+eier.biltype+"</td></tr>";
        }
        ut+="</tbody>";
        console.log(ut)
        $("#resultat").html(ut);
        $("#personnr").val("");
        $("#eiersNavn").val("");
        $("#eiersAdresse").val("");
        $("#kjennetegn").val("");
        $("#bilMerke").val("");
        $("#biltype").val("");

    })
}
function slettAlle() {
    $.get("/slett",function () {})
    tablo();

}
