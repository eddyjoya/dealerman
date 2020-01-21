/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dealerman.general;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;

/**
 *
 * @author eddie
 */
@Entity
@Table(name = "company")
public class Company implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "company_id", columnDefinition = "char(2)")
    private String companyId;

    @Column(name = "company_name", columnDefinition = "varchar(254)", nullable = true)
    private String companyName;

    @Column(name = "address", columnDefinition = "varchar(254)", nullable = true)
    private String address;

    @Column(name = "city", columnDefinition = "varchar(15)", nullable = true)
    private String city;

    @Column(name = "telephone", columnDefinition = "varchar(24)", nullable = true)
    private String telephone;

    @Column(name = "telephone1", columnDefinition = "varchar(24)", nullable = true)
    private String telephone1;

    @Column(name = "ruc", columnDefinition = "char(13)", nullable = false)
    private String ruc;

    @Column(name = "dollars", columnDefinition = "bit", nullable = true)
    private Boolean dollars;

    @Column(name = "askfac", columnDefinition = "bit", nullable = true)
    private Boolean askfac;

    @Column(name = "askdpto", columnDefinition = "bit", nullable = true)
    private Boolean askdpto;

    @Column(name = "askmoneda", columnDefinition = "bit", nullable = true)
    private Boolean askmoneda;

    @Column(name = "bank_id", columnDefinition = "char(2)", nullable = false)
    private String bankId;

    @Column(name = "asknp", columnDefinition = "bit", nullable = true)
    private Boolean asknp;

    @Column(name = "dctodetall", columnDefinition = "bit", nullable = true)
    private Boolean dctodetall;

    @Column(name = "cespecial_num", columnDefinition = "numeric(5)", nullable = true)
    private BigDecimal cespecialNum;

    @Column(name = "askdcto2", columnDefinition = "bit", nullable = true)
    private Boolean askdcto2;

    @Column(name = "cobraiva", columnDefinition = "bit", nullable = true)
    private Boolean cobraIva;

    @Column(name = "logo", columnDefinition = "text", nullable = true)
    private String logo;

    @Column(name = "ambiente", columnDefinition = "numeric(1)", nullable = true)
    private int ambiente;

    @Column(name = "modif1", columnDefinition = "bit", nullable = true)
    private Boolean modif1;

    @Column(name = "mismasec", columnDefinition = "bit", nullable = true)
    private Boolean mismasec;

    @Column(name = "flag", columnDefinition = "char(1)", nullable = false)
    private String flag;

    @Column(name = "control", columnDefinition = "char(7)", nullable = false)
    private String control;

    @Column(name = "mora", columnDefinition = "smalldatetime", nullable = false)
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date mora;

    @Column(name = "periodo", columnDefinition = "numeric(2)", nullable = true)
    private Integer periodo;

    @Column(name = "fecforzada", columnDefinition = "smalldatetime", nullable = false)
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date fecForzada;

    @Column(name = "estructura", columnDefinition = "char(20)", nullable = false)
    private String estructura;

    @Column(name = "activos", columnDefinition = "char(20)", nullable = false)
    private String activos;

    @Column(name = "pasivos", columnDefinition = "char(20)", nullable = false)
    private String pasivos;

    @Column(name = "patrimonio", columnDefinition = "char(20)", nullable = false)
    private String patrimonio;

    @Column(name = "patrimoni1", columnDefinition = "char(20)", nullable = false)
    private String patrimoni1;

    @Column(name = "ingresos", columnDefinition = "char(20)", nullable = false)
    private String ingresos;

    @Column(name = "gastos", columnDefinition = "char(20)", nullable = false)
    private String gastos;

    @Column(name = "caja", columnDefinition = "char(20)", nullable = false)
    private String caja;

    @Column(name = "cheques", columnDefinition = "char(20)", nullable = false)
    private String cheques;

    @Column(name = "our_comision", columnDefinition = "char(20)", nullable = false)
    private String ourComision;

    @Column(name = "impuestose", columnDefinition = "char(20)", nullable = false)
    private String impuestose;

    @Column(name = "impuestova", columnDefinition = "char(20)", nullable = false)
    private String impuestova;

    @Column(name = "ctaenvases", columnDefinition = "char(20)", nullable = false)
    private String ctaenvases;

    @Column(name = "ctafletes", columnDefinition = "char(20)", nullable = false)
    private String ctaFletes;

    @Column(name = "impuestopa", columnDefinition = "char(20)", nullable = false)
    private String impuestopa;

    @Column(name = "largopieza", columnDefinition = "numeric(2)", nullable = true)
    private Integer largoPieza;

    @Column(name = "noflibre", columnDefinition = "bit", nullable = true)
    private Boolean noflibre;

    @Column(name = "uenglish", columnDefinition = "bit", nullable = true)
    private Boolean uenglish;

    @Column(name = "upgroups", columnDefinition = "bit", nullable = true)
    private Boolean upgroups;

    @Column(name = "ufob", columnDefinition = "bit", nullable = true)
    private Boolean ufob;

    @Column(name = "uexcemptos", columnDefinition = "bit", nullable = true)
    private Boolean uexcemptos;

    @Column(name = "uprice1", columnDefinition = "bit", nullable = true)
    private Boolean uprice1;

    @Column(name = "uprice2", columnDefinition = "bit", nullable = true)
    private Boolean uprice2;

    @Column(name = "uprice3", columnDefinition = "bit", nullable = true)
    private Boolean uprice3;
    //50
    @Column(name = "upvp", columnDefinition = "bit", nullable = true)
    private Boolean upvp;

    @Column(name = "umedida", columnDefinition = "bit", nullable = true)
    private Boolean umedida;

    @Column(name = "upeso1", columnDefinition = "bit", nullable = true)
    private Boolean upeso1;

    @Column(name = "upeso2", columnDefinition = "bit", nullable = true)
    private Boolean upeso2;

    @Column(name = "upackages", columnDefinition = "bit", nullable = true)
    private Boolean upackages;

    @Column(name = "enteros", columnDefinition = "bit", nullable = true)
    private Boolean enteros;

    @Column(name = "buy_in_d", columnDefinition = "bit", nullable = true)
    private Boolean buyInD;

    @Column(name = "common_buy", columnDefinition = "char(1)", nullable = false)
    private String commonBuy;

    @Column(name = "ayudaencom", columnDefinition = "bit", nullable = true)
    private Boolean ayudaencom;

    @Column(name = "costoconim", columnDefinition = "bit", nullable = true)
    private Boolean costoconim;

    @Column(name = "porcentaje", columnDefinition = "numeric(2)", nullable = false)
    private Integer porcentaje;

    @Column(name = "uregion", columnDefinition = "bit", nullable = true)
    private Boolean uregion;

    @Column(name = "upobox", columnDefinition = "bit", nullable = true)
    private Boolean upobox;

    @Column(name = "ucountry", columnDefinition = "bit", nullable = true)
    private Boolean ucountry;

    @Column(name = "utitle", columnDefinition = "bit", nullable = true)
    private Boolean utitle;

    @Column(name = "ucexentos", columnDefinition = "bit", nullable = true)
    private Boolean ucexentos;

    @Column(name = "uzone", columnDefinition = "bit", nullable = true)
    private Boolean uzone;

    @Column(name = "askcarro", columnDefinition = "bit", nullable = true)
    private Boolean askcarro;

    @Column(name = "acterms", columnDefinition = "bit", nullable = true)
    private Boolean acterms;

    @Column(name = "acupo", columnDefinition = "bit", nullable = true)
    private Boolean acupo;

    @Column(name = "permiteneg", columnDefinition = "bit", nullable = true)
    private Boolean permiteneg;

    @Column(name = "cespecial", columnDefinition = "numeric(1)", nullable = false)
    private Integer cespecial;

    @Column(name = "retencio01", columnDefinition = "char(20)", nullable = false)
    private String retencio01;

    @Column(name = "retencio03", columnDefinition = "char(20)", nullable = false)
    private String retencio03;

    @Column(name = "retencio05", columnDefinition = "char(20)", nullable = false)
    private String retencio05;

    @Column(name = "retencio100", columnDefinition = "char(20)", nullable = false)
    private String retencio100;

    @Column(name = "retencio30", columnDefinition = "char(20)", nullable = false)
    private String retencio30;

    @Column(name = "retencio70", columnDefinition = "char(20)", nullable = false)
    private String retencio70;

    @Column(name = "retenido01", columnDefinition = "char(20)", nullable = false)
    private String retenido01;

    @Column(name = "internal_key", columnDefinition = "char(25)", nullable = false)
    private String internalKey;

    @Column(name = "token", columnDefinition = "char(25)", nullable = false)
    private String token;

    @Column(name = "smtp_name", columnDefinition = "char(20)", nullable = false)
    private String smtpName;

    @Column(name = "retenido30", columnDefinition = "char(20)", nullable = false)
    private String retenido30;

    @Column(name = "my_address", columnDefinition = "char(60)", nullable = false)
    private String myAddress;

    @Column(name = "chequesgir", columnDefinition = "char(20)", nullable = false)
    private String chequesgir;

    @Column(name = "libras", columnDefinition = "bit", nullable = true)
    private Boolean libras;

    @Column(name = "posfechado", columnDefinition = "bit", nullable = true)
    private Boolean posfechado;

    @Column(name = "anofiscal", columnDefinition = "numeric(4)", nullable = false)
    private Integer anoFiscal;

    @Column(name = "mescerrado", columnDefinition = "numeric(2)", nullable = false)
    private Integer mesCerrado;

    @Column(name = "asktexto", columnDefinition = "bit", nullable = true)
    private Boolean asktexto;

    @Column(name = "facdetail", columnDefinition = "bit", nullable = true)
    private Boolean facdetail;

    @Column(name = "comdetail", columnDefinition = "bit", nullable = true)
    private Boolean comdetail;

    @Column(name = "otrdetail", columnDefinition = "bit", nullable = true)
    private Boolean otrdetail;

    @Column(name = "tarjetacre", columnDefinition = "bit", nullable = true)
    private Boolean tarjetacre;

    @Column(name = "tipo_emision", columnDefinition = "numeric(1)", nullable = true)
    private Integer tipoEmision;

    @Column(name = "askparts", columnDefinition = "bit", nullable = true)
    private Boolean askparts;

    @Column(name = "formapago", columnDefinition = "bit", nullable = true)
    private Boolean formaPago;

    @Column(name = "formapago1", columnDefinition = "bit", nullable = true)
    private Boolean formaPago1;

    @Column(name = "actuforma", columnDefinition = "bit", nullable = true)
    private Boolean actuforma;

    @Column(name = "actucxpag", columnDefinition = "bit", nullable = true)
    private Boolean actucxpag;

    @Column(name = "ultimomes", columnDefinition = "numeric(2)", nullable = false)
    private Integer ultimoMes;

    @Column(name = "prioseg", columnDefinition = "numeric(2)", nullable = false)
    private Integer prioseg;

    @Column(name = "batch", columnDefinition = "bit", nullable = true)
    private Boolean batch;

    @Column(name = "costosfij", columnDefinition = "bit", nullable = true)
    private Boolean costosfij;

    @Column(name = "condicion", columnDefinition = "bit", nullable = true)
    private Boolean condicion;

    @Column(name = "aporvend", columnDefinition = "bit", nullable = true)
    private Boolean aporvend;

    @Column(name = "atrasado", columnDefinition = "bit", nullable = true)
    private Boolean atrasado;

    @Column(name = "clienteven", columnDefinition = "bit", nullable = true)
    private Boolean clienteven;

    @Column(name = "clientepre", columnDefinition = "bit", nullable = true)
    private Boolean clientepre;

    @Column(name = "clientedes", columnDefinition = "bit", nullable = true)
    private Boolean clientedes;

    @Column(name = "glenlinea", columnDefinition = "bit", nullable = true)
    private Boolean glenlinea;

    @Column(name = "otrnumero", columnDefinition = "bit", nullable = true)
    private Boolean otrnumero;

    @Column(name = "ganancia_c", columnDefinition = "char(20)", nullable = false)
    private String gananciaC;

    @Column(name = "perdida_c", columnDefinition = "char(20)", nullable = false)
    private String perdidaC;

    @Column(name = "diferencia_c", columnDefinition = "char(20)", nullable = false)
    private String diferenciaC;

    @Column(name = "ask3070", columnDefinition = "bit", nullable = true)
    private Boolean ask3070;

    @Column(name = "fcno_items", columnDefinition = "numeric(3)", nullable = false)
    private Integer fcnoItems;

    @Column(name = "smtp_port", columnDefinition = "numeric(3)", nullable = false)
    private Integer smtpPort;

    @Column(name = "fvno_items", columnDefinition = "numeric(3)", nullable = false)
    private Integer fvnoItems;

    @Column(name = "clientedes1", columnDefinition = "bit", nullable = true)
    private Boolean clientedes1;

    @Column(name = "askfv", columnDefinition = "bit", nullable = true)
    private Boolean askfv;

    @Column(name = "send_online", columnDefinition = "bit", nullable = true)
    private Boolean sendOnline;

    @Column(name = "askprice", columnDefinition = "bit", nullable = true)
    private Boolean askPrice;

    @Column(name = "e_i", columnDefinition = "bit", nullable = false)
    private Boolean eI;

    @Column(name = "timeout1", columnDefinition = "numeric(2,1)", nullable = false)
    private BigDecimal timeout1;

    @Column(name = "icc", columnDefinition = "char(20)", nullable = false)
    private String icc;

    @Column(name = "dalyve", columnDefinition = "bit", nullable = false)
    private Boolean dalyve;

    @Column(name = "bar_length", columnDefinition = "numeric(2)", nullable = false)
    private Integer barLength;

    @Column(name = "q_integers", columnDefinition = "numeric(1)", nullable = false)
    private Integer qIntegers;

    @Column(name = "q_decimals", columnDefinition = "numeric(1)", nullable = false)
    private Integer qDecimals;

    @Column(name = "impguia_d", columnDefinition = "bit", nullable = true)
    private Boolean impguiaD;

    @Column(name = "cards", columnDefinition = "char(20)", nullable = false)
    private String cards;

    @Column(name = "my_password", columnDefinition = "char(20)", nullable = false)
    private String myPassword;

    @Column(name = "comision", columnDefinition = "char(20)", nullable = false)
    private String comision;

    @Column(name = "sent_date", columnDefinition = "smalldatetime", nullable = false)
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date sentDate;

    @Column(name = "branch_id", columnDefinition = "char(2)", nullable = false)
    private String branchId;

    @Column(name = "jordan", columnDefinition = "bit", nullable = true)
    private Boolean jordan;

    @Column(name = "toscana", columnDefinition = "bit", nullable = true)
    private Boolean toscana;

    @Column(name = "domino", columnDefinition = "bit", nullable = true)
    private Boolean domino;

    @Column(name = "consep_code", columnDefinition = "char(9)", nullable = false)
    private String consepCode;

    @Column(name = "marlene", columnDefinition = "bit", nullable = true)
    private Boolean marlene;

    @Column(name = "cus_auto", columnDefinition = "bit", nullable = true)
    private Boolean cusAuto;

    @Column(name = "group_auto", columnDefinition = "bit", nullable = true)
    private Boolean groupAuto;

    @Column(name = "pgroup_auto", columnDefinition = "bit", nullable = true)
    private Boolean pgroupAuto;

    @Column(name = "single_checks", columnDefinition = "bit", nullable = true)
    private Boolean singleChecks;

    @Column(name = "single_ces", columnDefinition = "bit", nullable = true)
    private Boolean singleCes;

    @Column(name = "single_rets", columnDefinition = "bit", nullable = true)
    private Boolean singleRets;

    @Column(name = "s1001", columnDefinition = "bit", nullable = true)
    private Boolean s1001;

    @Column(name = "bonus", columnDefinition = "bit", nullable = true)
    private Boolean bonus;

    @Column(name = "truck", columnDefinition = "bit", nullable = true)
    private Boolean truck;
    //150
    @Column(name = "days1", columnDefinition = "tinyint", nullable = false)
    private Integer days1;

    @Column(name = "days2", columnDefinition = "tinyint", nullable = false)
    private Integer days2;

    @Column(name = "days3", columnDefinition = "tinyint", nullable = false)
    private Integer days3;

    @Column(name = "serials", columnDefinition = "bit", nullable = true)
    private Boolean serials;

    @Column(name = "ccuotas", columnDefinition = "numeric(2)", nullable = false)
    private Integer ccuotas;

    @Column(name = "fcuotas", columnDefinition = "numeric(2)", nullable = false)
    private Integer fcuotas;

    @Column(name = "ahmed", columnDefinition = "bit", nullable = true)
    private Boolean ahmed;

    @Column(name = "dfrom", columnDefinition = "smalldatetime", nullable = false)
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date dfrom;

    @Column(name = "dto", columnDefinition = "smalldatetime", nullable = false)
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date dto;

    @Column(name = "ndays", columnDefinition = "numeric(3)", nullable = false)
    private Integer ndays;

    @Column(name = "difrom", columnDefinition = "smalldatetime", nullable = false)
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date difrom;

    @Column(name = "dito", columnDefinition = "smalldatetime", nullable = false)
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date dito;

    @Column(name = "nunits", columnDefinition = "numeric(3)", nullable = false)
    private Integer nunits;

    @Column(name = "cretencion", columnDefinition = "bit", nullable = true)
    private Boolean cretencion;

    @Column(name = "dec_pos1", columnDefinition = "numeric(1)", nullable = false)
    private Integer decPos1;

    @Column(name = "dec_pos2", columnDefinition = "numeric(1)", nullable = false)
    private Integer decPos2;

    @Column(name = "dec_pos3", columnDefinition = "numeric(1)", nullable = false)
    private Integer decPos3;

    @Column(name = "uprice4", columnDefinition = "bit", nullable = true)
    private Boolean uprice4;

    @Column(name = "dec_pos4", columnDefinition = "numeric(1)", nullable = false)
    private Integer decPos4;

    @Column(name = "uprice5", columnDefinition = "bit", nullable = true)
    private Boolean uprice5;

    @Column(name = "dec_pos5", columnDefinition = "numeric(1)", nullable = false)
    private Integer decPos5;

    @Column(name = "uprice6", columnDefinition = "bit", nullable = true)
    private Boolean uprice6;

    @Column(name = "dec_pos6", columnDefinition = "numeric(1)", nullable = false)
    private Integer decPos6;

    @Column(name = "uprice7", columnDefinition = "bit", nullable = true)
    private Boolean uprice7;

    @Column(name = "dec_pos7", columnDefinition = "numeric(1)", nullable = false)
    private Integer decPos7;

    @Column(name = "uprice8", columnDefinition = "bit", nullable = true)
    private Boolean uprice8;

    @Column(name = "dec_pos8", columnDefinition = "numeric(1)", nullable = false)
    private Integer decPos8;

    @Column(name = "uprice9", columnDefinition = "bit", nullable = true)
    private Boolean uprice9;

    @Column(name = "dec_pos9", columnDefinition = "numeric(1)", nullable = false)
    private Integer decPos9;

    @Column(name = "uprice10", columnDefinition = "bit", nullable = true)
    private Boolean uprice10;

    @Column(name = "dec_pos10", columnDefinition = "numeric(1)", nullable = false)
    private Integer decPos10;

    @Column(name = "profit_perc", columnDefinition = "numeric(1)", nullable = false)
    private Integer profitPerc;

    @Column(name = "iva_included", columnDefinition = "bit", nullable = true)
    private Boolean ivaIncluded;

    @Column(name = "uunit", columnDefinition = "bit", nullable = true)
    private Boolean uunit;

    @Column(name = "product_auto", columnDefinition = "bit", nullable = true)
    private Boolean productAuto;

    @Column(name = "makers", columnDefinition = "bit", nullable = true)
    private Boolean makers;

    @Column(name = "pos", columnDefinition = "bit", nullable = true)
    private Boolean pos;

    @Column(name = "ucreditcard", columnDefinition = "bit", nullable = true)
    private Boolean ucreditCard;

    @Column(name = "discount1dec", columnDefinition = "bit", nullable = true)
    private Boolean discount1dec;

    @Column(name = "notsend_checks", columnDefinition = "bit", nullable = true)
    private Boolean notsendChecks;

    @Column(name = "sendproducts", columnDefinition = "bit", nullable = true)
    private Boolean sendProducts;

    @Column(name = "peno_items", columnDefinition = "numeric(3)", nullable = false)
    private Integer penoItems;

    @Column(name = "fc_noitems", columnDefinition = "numeric(3)", nullable = false)
    private Integer fcNoitems;

    @Column(name = "fv_noitems", columnDefinition = "numeric(3)", nullable = false)
    private Integer fvNoitems;

    @Column(name = "fe_noitems", columnDefinition = "numeric(3)", nullable = false)
    private Integer feNoitems;

    @Column(name = "fvisinvoice", columnDefinition = "bit", nullable = true)
    private Boolean fvisinvoice;

    @Column(name = "oldretencion", columnDefinition = "bit", nullable = true)
    private Boolean oldRetencion;

    @Column(name = "newprnegresos", columnDefinition = "bit", nullable = true)
    private Boolean newprnEgresos;

    @Column(name = "newprnreceipts", columnDefinition = "bit", nullable = true)
    private Boolean newprnreceipts;

    @Column(name = "newprnincomes", columnDefinition = "bit", nullable = true)
    private Boolean newprnincomes;

    @Column(name = "newprnretencion", columnDefinition = "bit", nullable = true)
    private Boolean newprnRetencion;

    @Column(name = "gpanalisys", columnDefinition = "bit", nullable = true)
    private Boolean gpanalisys;

    @Column(name = "comisionsales", columnDefinition = "bit", nullable = true)
    private Boolean comisionsales;

    @Column(name = "comisioncolle", columnDefinition = "bit", nullable = true)
    private Boolean comisioncolle;

    @Column(name = "nosanfco", columnDefinition = "bit", nullable = true)
    private Boolean nosanfco;

    @Column(name = "toledo", columnDefinition = "bit", nullable = true)
    private Boolean toledo;

    @Column(name = "noshowbr", columnDefinition = "bit", nullable = true)
    private Boolean noshowbr;

    @Column(name = "p_orders", columnDefinition = "bit", nullable = true)
    private Boolean pOrders;

    @Column(name = "razon_social", columnDefinition = "varchar(254)", nullable = true)
    private String razonSocial;

    @Column(name = "e_mail", columnDefinition = "varchar(60)", nullable = true)
    private String eMail;

    @Column(name = "tipo_id", columnDefinition = "char(1)", nullable = false)
    private String tipoId;

    @Column(name = "legal_id", columnDefinition = "char(13)", nullable = false)
    private String legalId;

    @Column(name = "accountant", columnDefinition = "char(13)", nullable = false)
    private String accountant;

    @Column(name = "fccredit_enable", columnDefinition = "bit", nullable = true)
    private Boolean fccreditEnable;

    @Column(name = "askfe", columnDefinition = "bit", nullable = true)
    private Boolean askfe;

    @Column(name = "fewithiva", columnDefinition = "bit", nullable = true)
    private Boolean fewithiva;

    @Column(name = "workshop", columnDefinition = "bit", nullable = true)
    private Boolean workshop;

    @Column(name = "ruc_is_code", columnDefinition = "bit", nullable = true)
    private Boolean rucIsCode;

    @Column(name = "unused1", columnDefinition = "bit", nullable = true)
    private Boolean unused1;

    @Column(name = "unused2", columnDefinition = "bit", nullable = true)
    private Boolean unused2;

    @Column(name = "unused3", columnDefinition = "bit", nullable = true)
    private Boolean unused3;

    @Column(name = "unused4", columnDefinition = "bit", nullable = true)
    private Boolean unused4;

    @Column(name = "unused5", columnDefinition = "bit", nullable = true)
    private Boolean unused5;

    @Column(name = "unused6", columnDefinition = "bit", nullable = true)
    private Boolean unused6;

    @Column(name = "unused7", columnDefinition = "bit", nullable = true)
    private Boolean unused7;

    @Column(name = "unused8", columnDefinition = "bit", nullable = true)
    private Boolean unused8;

    @Column(name = "unused9", columnDefinition = "bit", nullable = true)
    private Boolean unused9;

    @Column(name = "not_log", columnDefinition = "bit", nullable = true)
    private Boolean notLog;

    @Column(name = "sw1", columnDefinition = "bit", nullable = false)
    private Boolean sw1;

    @Column(name = "sw2", columnDefinition = "bit", nullable = false)
    private Boolean sw2;

    @Column(name = "sw3", columnDefinition = "bit", nullable = false)
    private Boolean sw3;

    @Column(name = "sw4", columnDefinition = "bit", nullable = false)
    private Boolean sw4;

    @Column(name = "sw5", columnDefinition = "bit", nullable = false)
    private Boolean sw5;

    @Column(name = "sw6", columnDefinition = "bit", nullable = false)
    private Boolean sw6;

    @Column(name = "sw7", columnDefinition = "bit", nullable = false)
    private Boolean sw7;

    @Column(name = "sw8", columnDefinition = "bit", nullable = false)
    private Boolean sw8;

    @Column(name = "sw9", columnDefinition = "bit", nullable = false)
    private Boolean sw9;

    @Column(name = "sw10", columnDefinition = "bit", nullable = false)
    private Boolean sw10;

    @Column(name = "sw11", columnDefinition = "bit", nullable = false)
    private Boolean sw11;

    @Column(name = "sw12", columnDefinition = "bit", nullable = false)
    private Boolean sw12;

    @Column(name = "sw13", columnDefinition = "bit", nullable = false)
    private Boolean sw13;

    @Column(name = "sw14", columnDefinition = "bit", nullable = false)
    private Boolean sw14;

    @Column(name = "sw15", columnDefinition = "bit", nullable = false)
    private Boolean sw15;

    @Column(name = "sw16", columnDefinition = "bit", nullable = false)
    private Boolean sw16;

    @Column(name = "sw17", columnDefinition = "bit", nullable = false)
    private Boolean sw17;

    @Column(name = "sw18", columnDefinition = "bit", nullable = false)
    private Boolean sw18;

    @Column(name = "sw19", columnDefinition = "bit", nullable = false)
    private Boolean sw19;

    @Column(name = "sw20", columnDefinition = "bit", nullable = false)
    private Boolean sw20;

    @Column(name = "sw21", columnDefinition = "bit", nullable = false)
    private Boolean sw21;

    @Column(name = "sw22", columnDefinition = "bit", nullable = false)
    private Boolean sw22;

    @Column(name = "discontinued", columnDefinition = "bit", nullable = false)
    private Boolean discontinued;

    @Column(name = "dummysupp", columnDefinition = "char(13)", nullable = true)
    private String dummysupp;

    @Column(name = "dummycust_ctype", columnDefinition = "tinyint", nullable = true)
    private Integer dummycustCtype;

    @Column(name = "dummycust_price_type", columnDefinition = "tinyint", nullable = true)
    private Integer dummycustPriceType;

    @OneToMany(mappedBy = "companyId")
    private List<Branches> listBranches;

    public Company() {
    }

    public Company(String companyId, String legalId) {
        this.companyId = companyId;
        this.legalId = legalId;
    }

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public Boolean getDollars() {
        return dollars;
    }

    public void setDollars(Boolean dollars) {
        this.dollars = dollars;
    }

    public BigDecimal getCespecialNum() {
        return cespecialNum;
    }

    public void setCespecialNum(BigDecimal cespecialNum) {
        this.cespecialNum = cespecialNum;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public Date getMora() {
        return mora;
    }

    public void setMora(Date mora) {
        this.mora = mora;
    }

    public Integer getDays1() {
        return days1;
    }

    public void setDays1(Integer days1) {
        this.days1 = days1;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getTelephone1() {
        return telephone1;
    }

    public void setTelephone1(String telephone1) {
        this.telephone1 = telephone1;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public Boolean getAskfac() {
        return askfac;
    }

    public void setAskfac(Boolean askfac) {
        this.askfac = askfac;
    }

    public Boolean getAskdpto() {
        return askdpto;
    }

    public void setAskdpto(Boolean askdpto) {
        this.askdpto = askdpto;
    }

    public Boolean getAskmoneda() {
        return askmoneda;
    }

    public void setAskmoneda(Boolean askmoneda) {
        this.askmoneda = askmoneda;
    }

    public String getBankId() {
        return bankId;
    }

    public void setBankId(String bankId) {
        this.bankId = bankId;
    }

    public Boolean getAsknp() {
        return asknp;
    }

    public void setAsknp(Boolean asknp) {
        this.asknp = asknp;
    }

    public Boolean getDctodetall() {
        return dctodetall;
    }

    public void setDctodetall(Boolean dctodetall) {
        this.dctodetall = dctodetall;
    }

    public Boolean getAskdcto2() {
        return askdcto2;
    }

    public void setAskdcto2(Boolean askdcto2) {
        this.askdcto2 = askdcto2;
    }

    public Boolean getCobraIva() {
        return cobraIva;
    }

    public void setCobraIva(Boolean cobraIva) {
        this.cobraIva = cobraIva;
    }

    public int getAmbiente() {
        return ambiente;
    }

    public void setAmbiente(int ambiente) {
        this.ambiente = ambiente;
    }

    public Boolean getModif1() {
        return modif1;
    }

    public void setModif1(Boolean modif1) {
        this.modif1 = modif1;
    }

    public Boolean getMismasec() {
        return mismasec;
    }

    public void setMismasec(Boolean mismasec) {
        this.mismasec = mismasec;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public String getControl() {
        return control;
    }

    public void setControl(String control) {
        this.control = control;
    }

    public Integer getPeriodo() {
        return periodo;
    }

    public void setPeriodo(Integer periodo) {
        this.periodo = periodo;
    }

    public Date getFecForzada() {
        return fecForzada;
    }

    public void setFecForzada(Date fecForzada) {
        this.fecForzada = fecForzada;
    }

    public String getEstructura() {
        return estructura;
    }

    public void setEstructura(String estructura) {
        this.estructura = estructura;
    }

    public String getActivos() {
        return activos;
    }

    public void setActivos(String activos) {
        this.activos = activos;
    }

    public String getPasivos() {
        return pasivos;
    }

    public void setPasivos(String pasivos) {
        this.pasivos = pasivos;
    }

    public String getPatrimonio() {
        return patrimonio;
    }

    public void setPatrimonio(String patrimonio) {
        this.patrimonio = patrimonio;
    }

    public String getPatrimoni1() {
        return patrimoni1;
    }

    public void setPatrimoni1(String patrimoni1) {
        this.patrimoni1 = patrimoni1;
    }

    public String getIngresos() {
        return ingresos;
    }

    public void setIngresos(String ingresos) {
        this.ingresos = ingresos;
    }

    public String getGastos() {
        return gastos;
    }

    public void setGastos(String gastos) {
        this.gastos = gastos;
    }

    public String getCaja() {
        return caja;
    }

    public void setCaja(String caja) {
        this.caja = caja;
    }

    public String getCheques() {
        return cheques;
    }

    public void setCheques(String cheques) {
        this.cheques = cheques;
    }

    public String getOurComision() {
        return ourComision;
    }

    public void setOurComision(String ourComision) {
        this.ourComision = ourComision;
    }

    public String getImpuestose() {
        return impuestose;
    }

    public void setImpuestose(String impuestose) {
        this.impuestose = impuestose;
    }

    public String getImpuestova() {
        return impuestova;
    }

    public void setImpuestova(String impuestova) {
        this.impuestova = impuestova;
    }

    public String getCtaenvases() {
        return ctaenvases;
    }

    public void setCtaenvases(String ctaenvases) {
        this.ctaenvases = ctaenvases;
    }

    public String getCtaFletes() {
        return ctaFletes;
    }

    public void setCtaFletes(String ctaFletes) {
        this.ctaFletes = ctaFletes;
    }

    public String getImpuestopa() {
        return impuestopa;
    }

    public void setImpuestopa(String impuestopa) {
        this.impuestopa = impuestopa;
    }

    public Integer getLargoPieza() {
        return largoPieza;
    }

    public void setLargoPieza(Integer largoPieza) {
        this.largoPieza = largoPieza;
    }

    public Boolean getNoflibre() {
        return noflibre;
    }

    public void setNoflibre(Boolean noflibre) {
        this.noflibre = noflibre;
    }

    public Boolean getUenglish() {
        return uenglish;
    }

    public void setUenglish(Boolean uenglish) {
        this.uenglish = uenglish;
    }

    public Boolean getUpgroups() {
        return upgroups;
    }

    public void setUpgroups(Boolean upgroups) {
        this.upgroups = upgroups;
    }

    public Boolean getUfob() {
        return ufob;
    }

    public void setUfob(Boolean ufob) {
        this.ufob = ufob;
    }

    public Boolean getUexcemptos() {
        return uexcemptos;
    }

    public void setUexcemptos(Boolean uexcemptos) {
        this.uexcemptos = uexcemptos;
    }

    public Boolean getUprice1() {
        return uprice1;
    }

    public void setUprice1(Boolean uprice1) {
        this.uprice1 = uprice1;
    }

    public Boolean getUprice2() {
        return uprice2;
    }

    public void setUprice2(Boolean uprice2) {
        this.uprice2 = uprice2;
    }

    public Boolean getUprice3() {
        return uprice3;
    }

    public void setUprice3(Boolean uprice3) {
        this.uprice3 = uprice3;
    }

    public Boolean getUpvp() {
        return upvp;
    }

    public void setUpvp(Boolean upvp) {
        this.upvp = upvp;
    }

    public Boolean getUmedida() {
        return umedida;
    }

    public void setUmedida(Boolean umedida) {
        this.umedida = umedida;
    }

    public Boolean getUpeso1() {
        return upeso1;
    }

    public void setUpeso1(Boolean upeso1) {
        this.upeso1 = upeso1;
    }

    public Boolean getUpeso2() {
        return upeso2;
    }

    public void setUpeso2(Boolean upeso2) {
        this.upeso2 = upeso2;
    }

    public Boolean getUpackages() {
        return upackages;
    }

    public void setUpackages(Boolean upackages) {
        this.upackages = upackages;
    }

    public Boolean getEnteros() {
        return enteros;
    }

    public void setEnteros(Boolean enteros) {
        this.enteros = enteros;
    }

    public Boolean getBuyInD() {
        return buyInD;
    }

    public void setBuyInD(Boolean buyInD) {
        this.buyInD = buyInD;
    }

    public String getCommonBuy() {
        return commonBuy;
    }

    public void setCommonBuy(String commonBuy) {
        this.commonBuy = commonBuy;
    }

    public Boolean getAyudaencom() {
        return ayudaencom;
    }

    public void setAyudaencom(Boolean ayudaencom) {
        this.ayudaencom = ayudaencom;
    }

    public Boolean getCostoconim() {
        return costoconim;
    }

    public void setCostoconim(Boolean costoconim) {
        this.costoconim = costoconim;
    }

    public Integer getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(Integer porcentaje) {
        this.porcentaje = porcentaje;
    }

    public Boolean getUregion() {
        return uregion;
    }

    public void setUregion(Boolean uregion) {
        this.uregion = uregion;
    }

    public Boolean getUpobox() {
        return upobox;
    }

    public void setUpobox(Boolean upobox) {
        this.upobox = upobox;
    }

    public Boolean getUcountry() {
        return ucountry;
    }

    public void setUcountry(Boolean ucountry) {
        this.ucountry = ucountry;
    }

    public Boolean getUtitle() {
        return utitle;
    }

    public void setUtitle(Boolean utitle) {
        this.utitle = utitle;
    }

    public Boolean getUcexentos() {
        return ucexentos;
    }

    public void setUcexentos(Boolean ucexentos) {
        this.ucexentos = ucexentos;
    }

    public Boolean getUzone() {
        return uzone;
    }

    public void setUzone(Boolean uzone) {
        this.uzone = uzone;
    }

    public Boolean getAskcarro() {
        return askcarro;
    }

    public void setAskcarro(Boolean askcarro) {
        this.askcarro = askcarro;
    }

    public Boolean getActerms() {
        return acterms;
    }

    public void setActerms(Boolean acterms) {
        this.acterms = acterms;
    }

    public Boolean getAcupo() {
        return acupo;
    }

    public void setAcupo(Boolean acupo) {
        this.acupo = acupo;
    }

    public Boolean getPermiteneg() {
        return permiteneg;
    }

    public void setPermiteneg(Boolean permiteneg) {
        this.permiteneg = permiteneg;
    }

    public Integer getCespecial() {
        return cespecial;
    }

    public void setCespecial(Integer cespecial) {
        this.cespecial = cespecial;
    }

    public String getRetencio01() {
        return retencio01;
    }

    public void setRetencio01(String retencio01) {
        this.retencio01 = retencio01;
    }

    public String getRetencio03() {
        return retencio03;
    }

    public void setRetencio03(String retencio03) {
        this.retencio03 = retencio03;
    }

    public String getRetencio05() {
        return retencio05;
    }

    public void setRetencio05(String retencio05) {
        this.retencio05 = retencio05;
    }

    public String getRetencio100() {
        return retencio100;
    }

    public void setRetencio100(String retencio100) {
        this.retencio100 = retencio100;
    }

    public String getRetencio30() {
        return retencio30;
    }

    public void setRetencio30(String retencio30) {
        this.retencio30 = retencio30;
    }

    public String getRetencio70() {
        return retencio70;
    }

    public void setRetencio70(String retencio70) {
        this.retencio70 = retencio70;
    }

    public String getRetenido01() {
        return retenido01;
    }

    public void setRetenido01(String retenido01) {
        this.retenido01 = retenido01;
    }

    public String getInternalKey() {
        return internalKey;
    }

    public void setInternalKey(String internalKey) {
        this.internalKey = internalKey;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getSmtpName() {
        return smtpName;
    }

    public void setSmtpName(String smtpName) {
        this.smtpName = smtpName;
    }

    public String getRetenido30() {
        return retenido30;
    }

    public void setRetenido30(String retenido30) {
        this.retenido30 = retenido30;
    }

    public String getMyAddress() {
        return myAddress;
    }

    public void setMyAddress(String myAddress) {
        this.myAddress = myAddress;
    }

    public String getChequesgir() {
        return chequesgir;
    }

    public void setChequesgir(String chequesgir) {
        this.chequesgir = chequesgir;
    }

    public Boolean getLibras() {
        return libras;
    }

    public void setLibras(Boolean libras) {
        this.libras = libras;
    }

    public Boolean getPosfechado() {
        return posfechado;
    }

    public void setPosfechado(Boolean posfechado) {
        this.posfechado = posfechado;
    }

    public Integer getAnoFiscal() {
        return anoFiscal;
    }

    public void setAnoFiscal(Integer anoFiscal) {
        this.anoFiscal = anoFiscal;
    }

    public Integer getMesCerrado() {
        return mesCerrado;
    }

    public void setMesCerrado(Integer mesCerrado) {
        this.mesCerrado = mesCerrado;
    }

    public Boolean getAsktexto() {
        return asktexto;
    }

    public void setAsktexto(Boolean asktexto) {
        this.asktexto = asktexto;
    }

    public Boolean getFacdetail() {
        return facdetail;
    }

    public void setFacdetail(Boolean facdetail) {
        this.facdetail = facdetail;
    }

    public Boolean getComdetail() {
        return comdetail;
    }

    public void setComdetail(Boolean comdetail) {
        this.comdetail = comdetail;
    }

    public Boolean getOtrdetail() {
        return otrdetail;
    }

    public void setOtrdetail(Boolean otrdetail) {
        this.otrdetail = otrdetail;
    }

    public Boolean getTarjetacre() {
        return tarjetacre;
    }

    public void setTarjetacre(Boolean tarjetacre) {
        this.tarjetacre = tarjetacre;
    }

    public Integer getTipoEmision() {
        return tipoEmision;
    }

    public void setTipoEmision(Integer tipoEmision) {
        this.tipoEmision = tipoEmision;
    }

    public Boolean getAskparts() {
        return askparts;
    }

    public void setAskparts(Boolean askparts) {
        this.askparts = askparts;
    }

    public Boolean getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(Boolean formaPago) {
        this.formaPago = formaPago;
    }

    public Boolean getFormaPago1() {
        return formaPago1;
    }

    public void setFormaPago1(Boolean formaPago1) {
        this.formaPago1 = formaPago1;
    }

    public Boolean getActuforma() {
        return actuforma;
    }

    public void setActuforma(Boolean actuforma) {
        this.actuforma = actuforma;
    }

    public Boolean getActucxpag() {
        return actucxpag;
    }

    public void setActucxpag(Boolean actucxpag) {
        this.actucxpag = actucxpag;
    }

    public Integer getUltimoMes() {
        return ultimoMes;
    }

    public void setUltimoMes(Integer ultimoMes) {
        this.ultimoMes = ultimoMes;
    }

    public Integer getPrioseg() {
        return prioseg;
    }

    public void setPrioseg(Integer prioseg) {
        this.prioseg = prioseg;
    }

    public Boolean getBatch() {
        return batch;
    }

    public void setBatch(Boolean batch) {
        this.batch = batch;
    }

    public Boolean getCostosfij() {
        return costosfij;
    }

    public void setCostosfij(Boolean costosfij) {
        this.costosfij = costosfij;
    }

    public Boolean getCondicion() {
        return condicion;
    }

    public void setCondicion(Boolean condicion) {
        this.condicion = condicion;
    }

    public Boolean getAporvend() {
        return aporvend;
    }

    public void setAporvend(Boolean aporvend) {
        this.aporvend = aporvend;
    }

    public Boolean getAtrasado() {
        return atrasado;
    }

    public void setAtrasado(Boolean atrasado) {
        this.atrasado = atrasado;
    }

    public Boolean getClienteven() {
        return clienteven;
    }

    public void setClienteven(Boolean clienteven) {
        this.clienteven = clienteven;
    }

    public Boolean getClientepre() {
        return clientepre;
    }

    public void setClientepre(Boolean clientepre) {
        this.clientepre = clientepre;
    }

    public Boolean getClientedes() {
        return clientedes;
    }

    public void setClientedes(Boolean clientedes) {
        this.clientedes = clientedes;
    }

    public Boolean getGlenlinea() {
        return glenlinea;
    }

    public void setGlenlinea(Boolean glenlinea) {
        this.glenlinea = glenlinea;
    }

    public Boolean getOtrnumero() {
        return otrnumero;
    }

    public void setOtrnumero(Boolean otrnumero) {
        this.otrnumero = otrnumero;
    }

    public String getGananciaC() {
        return gananciaC;
    }

    public void setGananciaC(String gananciaC) {
        this.gananciaC = gananciaC;
    }

    public String getPerdidaC() {
        return perdidaC;
    }

    public void setPerdidaC(String perdidaC) {
        this.perdidaC = perdidaC;
    }

    public String getDiferenciaC() {
        return diferenciaC;
    }

    public void setDiferenciaC(String diferenciaC) {
        this.diferenciaC = diferenciaC;
    }

    public Boolean getAsk3070() {
        return ask3070;
    }

    public void setAsk3070(Boolean ask3070) {
        this.ask3070 = ask3070;
    }

    public Integer getFcnoItems() {
        return fcnoItems;
    }

    public void setFcnoItems(Integer fcnoItems) {
        this.fcnoItems = fcnoItems;
    }

    public Integer getSmtpPort() {
        return smtpPort;
    }

    public void setSmtpPort(Integer smtpPort) {
        this.smtpPort = smtpPort;
    }

    public Integer getFvnoItems() {
        return fvnoItems;
    }

    public void setFvnoItems(Integer fvnoItems) {
        this.fvnoItems = fvnoItems;
    }

    public Boolean getClientedes1() {
        return clientedes1;
    }

    public void setClientedes1(Boolean clientedes1) {
        this.clientedes1 = clientedes1;
    }

    public Boolean getAskfv() {
        return askfv;
    }

    public void setAskfv(Boolean askfv) {
        this.askfv = askfv;
    }

    public Boolean getSendOnline() {
        return sendOnline;
    }

    public void setSendOnline(Boolean sendOnline) {
        this.sendOnline = sendOnline;
    }

    public Boolean getAskPrice() {
        return askPrice;
    }

    public void setAskPrice(Boolean askPrice) {
        this.askPrice = askPrice;
    }

    public Boolean geteI() {
        return eI;
    }

    public void seteI(Boolean eI) {
        this.eI = eI;
    }

    public BigDecimal getTimeout1() {
        return timeout1;
    }

    public void setTimeout1(BigDecimal timeout1) {
        this.timeout1 = timeout1;
    }

    public String getIcc() {
        return icc;
    }

    public void setIcc(String icc) {
        this.icc = icc;
    }

    public Boolean getDalyve() {
        return dalyve;
    }

    public void setDalyve(Boolean dalyve) {
        this.dalyve = dalyve;
    }

    public Integer getBarLength() {
        return barLength;
    }

    public void setBarLength(Integer barLength) {
        this.barLength = barLength;
    }

    public Integer getqIntegers() {
        return qIntegers;
    }

    public void setqIntegers(Integer qIntegers) {
        this.qIntegers = qIntegers;
    }

    public Integer getqDecimals() {
        return qDecimals;
    }

    public void setqDecimals(Integer qDecimals) {
        this.qDecimals = qDecimals;
    }

    public Boolean getImpguiaD() {
        return impguiaD;
    }

    public void setImpguiaD(Boolean impguiaD) {
        this.impguiaD = impguiaD;
    }

    public String getCards() {
        return cards;
    }

    public void setCards(String cards) {
        this.cards = cards;
    }

    public String getMyPassword() {
        return myPassword;
    }

    public void setMyPassword(String myPassword) {
        this.myPassword = myPassword;
    }

    public String getComision() {
        return comision;
    }

    public void setComision(String comision) {
        this.comision = comision;
    }

    public Date getSentDate() {
        return sentDate;
    }

    public void setSentDate(Date sentDate) {
        this.sentDate = sentDate;
    }

    public String getBranchId() {
        return branchId;
    }

    public void setBranchId(String branchId) {
        this.branchId = branchId;
    }

    public Boolean getJordan() {
        return jordan;
    }

    public void setJordan(Boolean jordan) {
        this.jordan = jordan;
    }

    public Boolean getToscana() {
        return toscana;
    }

    public void setToscana(Boolean toscana) {
        this.toscana = toscana;
    }

    public Boolean getDomino() {
        return domino;
    }

    public void setDomino(Boolean domino) {
        this.domino = domino;
    }

    public String getConsepCode() {
        return consepCode;
    }

    public void setConsepCode(String consepCode) {
        this.consepCode = consepCode;
    }

    public Boolean getMarlene() {
        return marlene;
    }

    public void setMarlene(Boolean marlene) {
        this.marlene = marlene;
    }

    public Boolean getCusAuto() {
        return cusAuto;
    }

    public void setCusAuto(Boolean cusAuto) {
        this.cusAuto = cusAuto;
    }

    public Boolean getGroupAuto() {
        return groupAuto;
    }

    public void setGroupAuto(Boolean groupAuto) {
        this.groupAuto = groupAuto;
    }

    public Boolean getPgroupAuto() {
        return pgroupAuto;
    }

    public void setPgroupAuto(Boolean pgroupAuto) {
        this.pgroupAuto = pgroupAuto;
    }

    public Boolean getSingleChecks() {
        return singleChecks;
    }

    public void setSingleChecks(Boolean singleChecks) {
        this.singleChecks = singleChecks;
    }

    public Boolean getSingleCes() {
        return singleCes;
    }

    public void setSingleCes(Boolean singleCes) {
        this.singleCes = singleCes;
    }

    public Boolean getSingleRets() {
        return singleRets;
    }

    public void setSingleRets(Boolean singleRets) {
        this.singleRets = singleRets;
    }

    public Boolean getS1001() {
        return s1001;
    }

    public void setS1001(Boolean s1001) {
        this.s1001 = s1001;
    }

    public Boolean getBonus() {
        return bonus;
    }

    public void setBonus(Boolean bonus) {
        this.bonus = bonus;
    }

    public Boolean getTruck() {
        return truck;
    }

    public void setTruck(Boolean truck) {
        this.truck = truck;
    }

    public Integer getDays2() {
        return days2;
    }

    public void setDays2(Integer days2) {
        this.days2 = days2;
    }

    public Integer getDays3() {
        return days3;
    }

    public void setDays3(Integer days3) {
        this.days3 = days3;
    }

    public Boolean getSerials() {
        return serials;
    }

    public void setSerials(Boolean serials) {
        this.serials = serials;
    }

    public Integer getCcuotas() {
        return ccuotas;
    }

    public void setCcuotas(Integer ccuotas) {
        this.ccuotas = ccuotas;
    }

    public Integer getFcuotas() {
        return fcuotas;
    }

    public void setFcuotas(Integer fcuotas) {
        this.fcuotas = fcuotas;
    }

    public Boolean getAhmed() {
        return ahmed;
    }

    public void setAhmed(Boolean ahmed) {
        this.ahmed = ahmed;
    }

    public Date getDfrom() {
        return dfrom;
    }

    public void setDfrom(Date dfrom) {
        this.dfrom = dfrom;
    }

    public Date getDto() {
        return dto;
    }

    public void setDto(Date dto) {
        this.dto = dto;
    }

    public Integer getNdays() {
        return ndays;
    }

    public void setNdays(Integer ndays) {
        this.ndays = ndays;
    }

    public Date getDifrom() {
        return difrom;
    }

    public void setDifrom(Date difrom) {
        this.difrom = difrom;
    }

    public Date getDito() {
        return dito;
    }

    public void setDito(Date dito) {
        this.dito = dito;
    }

    public Integer getNunits() {
        return nunits;
    }

    public void setNunits(Integer nunits) {
        this.nunits = nunits;
    }

    public Boolean getCretencion() {
        return cretencion;
    }

    public void setCretencion(Boolean cretencion) {
        this.cretencion = cretencion;
    }

    public Integer getDecPos1() {
        return decPos1;
    }

    public void setDecPos1(Integer decPos1) {
        this.decPos1 = decPos1;
    }

    public Integer getDecPos2() {
        return decPos2;
    }

    public void setDecPos2(Integer decPos2) {
        this.decPos2 = decPos2;
    }

    public Integer getDecPos3() {
        return decPos3;
    }

    public void setDecPos3(Integer decPos3) {
        this.decPos3 = decPos3;
    }

    public Boolean getUprice4() {
        return uprice4;
    }

    public void setUprice4(Boolean uprice4) {
        this.uprice4 = uprice4;
    }

    public Integer getDecPos4() {
        return decPos4;
    }

    public void setDecPos4(Integer decPos4) {
        this.decPos4 = decPos4;
    }

    public Boolean getUprice5() {
        return uprice5;
    }

    public void setUprice5(Boolean uprice5) {
        this.uprice5 = uprice5;
    }

    public Integer getDecPos5() {
        return decPos5;
    }

    public void setDecPos5(Integer decPos5) {
        this.decPos5 = decPos5;
    }

    public Boolean getUprice6() {
        return uprice6;
    }

    public void setUprice6(Boolean uprice6) {
        this.uprice6 = uprice6;
    }

    public Integer getDecPos6() {
        return decPos6;
    }

    public void setDecPos6(Integer decPos6) {
        this.decPos6 = decPos6;
    }

    public Boolean getUprice7() {
        return uprice7;
    }

    public void setUprice7(Boolean uprice7) {
        this.uprice7 = uprice7;
    }

    public Integer getDecPos7() {
        return decPos7;
    }

    public void setDecPos7(Integer decPos7) {
        this.decPos7 = decPos7;
    }

    public Boolean getUprice8() {
        return uprice8;
    }

    public void setUprice8(Boolean uprice8) {
        this.uprice8 = uprice8;
    }

    public Integer getDecPos8() {
        return decPos8;
    }

    public void setDecPos8(Integer decPos8) {
        this.decPos8 = decPos8;
    }

    public Boolean getUprice9() {
        return uprice9;
    }

    public void setUprice9(Boolean uprice9) {
        this.uprice9 = uprice9;
    }

    public Integer getDecPos9() {
        return decPos9;
    }

    public void setDecPos9(Integer decPos9) {
        this.decPos9 = decPos9;
    }

    public Boolean getUprice10() {
        return uprice10;
    }

    public void setUprice10(Boolean uprice10) {
        this.uprice10 = uprice10;
    }

    public Integer getDecPos10() {
        return decPos10;
    }

    public void setDecPos10(Integer decPos10) {
        this.decPos10 = decPos10;
    }

    public Integer getProfitPerc() {
        return profitPerc;
    }

    public void setProfitPerc(Integer profitPerc) {
        this.profitPerc = profitPerc;
    }

    public Boolean getIvaIncluded() {
        return ivaIncluded;
    }

    public void setIvaIncluded(Boolean ivaIncluded) {
        this.ivaIncluded = ivaIncluded;
    }

    public Boolean getUunit() {
        return uunit;
    }

    public void setUunit(Boolean uunit) {
        this.uunit = uunit;
    }

    public Boolean getProductAuto() {
        return productAuto;
    }

    public void setProductAuto(Boolean productAuto) {
        this.productAuto = productAuto;
    }

    public Boolean getMakers() {
        return makers;
    }

    public void setMakers(Boolean makers) {
        this.makers = makers;
    }

    public Boolean getPos() {
        return pos;
    }

    public void setPos(Boolean pos) {
        this.pos = pos;
    }

    public Boolean getUcreditCard() {
        return ucreditCard;
    }

    public void setUcreditCard(Boolean ucreditCard) {
        this.ucreditCard = ucreditCard;
    }

    public Boolean getDiscount1dec() {
        return discount1dec;
    }

    public void setDiscount1dec(Boolean discount1dec) {
        this.discount1dec = discount1dec;
    }

    public Boolean getNotsendChecks() {
        return notsendChecks;
    }

    public void setNotsendChecks(Boolean notsendChecks) {
        this.notsendChecks = notsendChecks;
    }

    public Boolean getSendProducts() {
        return sendProducts;
    }

    public void setSendProducts(Boolean sendProducts) {
        this.sendProducts = sendProducts;
    }

    public Integer getPenoItems() {
        return penoItems;
    }

    public void setPenoItems(Integer penoItems) {
        this.penoItems = penoItems;
    }

    public Integer getFcNoitems() {
        return fcNoitems;
    }

    public void setFcNoitems(Integer fcNoitems) {
        this.fcNoitems = fcNoitems;
    }

    public Integer getFeNoitems() {
        return feNoitems;
    }

    public void setFeNoitems(Integer feNoitems) {
        this.feNoitems = feNoitems;
    }

    public Boolean getFvisinvoice() {
        return fvisinvoice;
    }

    public void setFvisinvoice(Boolean fvisinvoice) {
        this.fvisinvoice = fvisinvoice;
    }

    public Boolean getOldRetencion() {
        return oldRetencion;
    }

    public void setOldRetencion(Boolean oldRetencion) {
        this.oldRetencion = oldRetencion;
    }

    public Boolean getNewprnEgresos() {
        return newprnEgresos;
    }

    public void setNewprnEgresos(Boolean newprnEgresos) {
        this.newprnEgresos = newprnEgresos;
    }

    public Boolean getNewprnreceipts() {
        return newprnreceipts;
    }

    public void setNewprnreceipts(Boolean newprnreceipts) {
        this.newprnreceipts = newprnreceipts;
    }

    public Boolean getNewprnincomes() {
        return newprnincomes;
    }

    public void setNewprnincomes(Boolean newprnincomes) {
        this.newprnincomes = newprnincomes;
    }

    public Boolean getNewprnRetencion() {
        return newprnRetencion;
    }

    public void setNewprnRetencion(Boolean newprnRetencion) {
        this.newprnRetencion = newprnRetencion;
    }

    public Boolean getGpanalisys() {
        return gpanalisys;
    }

    public void setGpanalisys(Boolean gpanalisys) {
        this.gpanalisys = gpanalisys;
    }

    public Boolean getComisionsales() {
        return comisionsales;
    }

    public void setComisionsales(Boolean comisionsales) {
        this.comisionsales = comisionsales;
    }

    public Boolean getComisioncolle() {
        return comisioncolle;
    }

    public void setComisioncolle(Boolean comisioncolle) {
        this.comisioncolle = comisioncolle;
    }

    public Boolean getNosanfco() {
        return nosanfco;
    }

    public void setNosanfco(Boolean nosanfco) {
        this.nosanfco = nosanfco;
    }

    public Boolean getToledo() {
        return toledo;
    }

    public void setToledo(Boolean toledo) {
        this.toledo = toledo;
    }

    public Boolean getNoshowbr() {
        return noshowbr;
    }

    public void setNoshowbr(Boolean noshowbr) {
        this.noshowbr = noshowbr;
    }

    public Boolean getpOrders() {
        return pOrders;
    }

    public void setpOrders(Boolean pOrders) {
        this.pOrders = pOrders;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public String getTipoId() {
        return tipoId;
    }

    public void setTipoId(String tipoId) {
        this.tipoId = tipoId;
    }

    public String getLegalId() {
        return legalId;
    }

    public void setLegalId(String legalId) {
        this.legalId = legalId;
    }

    public String getAccountant() {
        return accountant;
    }

    public void setAccountant(String accountant) {
        this.accountant = accountant;
    }

    public Boolean getFccreditEnable() {
        return fccreditEnable;
    }

    public void setFccreditEnable(Boolean fccreditEnable) {
        this.fccreditEnable = fccreditEnable;
    }

    public Boolean getAskfe() {
        return askfe;
    }

    public void setAskfe(Boolean askfe) {
        this.askfe = askfe;
    }

    public Boolean getFewithiva() {
        return fewithiva;
    }

    public void setFewithiva(Boolean fewithiva) {
        this.fewithiva = fewithiva;
    }

    public Boolean getWorkshop() {
        return workshop;
    }

    public void setWorkshop(Boolean workshop) {
        this.workshop = workshop;
    }

    public Boolean getRucIsCode() {
        return rucIsCode;
    }

    public void setRucIsCode(Boolean rucIsCode) {
        this.rucIsCode = rucIsCode;
    }

    public Boolean getUnused1() {
        return unused1;
    }

    public void setUnused1(Boolean unused1) {
        this.unused1 = unused1;
    }

    public Boolean getUnused2() {
        return unused2;
    }

    public void setUnused2(Boolean unused2) {
        this.unused2 = unused2;
    }

    public Boolean getUnused3() {
        return unused3;
    }

    public void setUnused3(Boolean unused3) {
        this.unused3 = unused3;
    }

    public Boolean getUnused4() {
        return unused4;
    }

    public void setUnused4(Boolean unused4) {
        this.unused4 = unused4;
    }

    public Boolean getUnused5() {
        return unused5;
    }

    public void setUnused5(Boolean unused5) {
        this.unused5 = unused5;
    }

    public Boolean getUnused6() {
        return unused6;
    }

    public void setUnused6(Boolean unused6) {
        this.unused6 = unused6;
    }

    public Boolean getUnused7() {
        return unused7;
    }

    public void setUnused7(Boolean unused7) {
        this.unused7 = unused7;
    }

    public Boolean getUnused8() {
        return unused8;
    }

    public void setUnused8(Boolean unused8) {
        this.unused8 = unused8;
    }

    public Boolean getUnused9() {
        return unused9;
    }

    public void setUnused9(Boolean unused9) {
        this.unused9 = unused9;
    }

    public Boolean getNotLog() {
        return notLog;
    }

    public void setNotLog(Boolean notLog) {
        this.notLog = notLog;
    }

    public Boolean getSw1() {
        return sw1;
    }

    public void setSw1(Boolean sw1) {
        this.sw1 = sw1;
    }

    public Boolean getSw2() {
        return sw2;
    }

    public void setSw2(Boolean sw2) {
        this.sw2 = sw2;
    }

    public Boolean getSw3() {
        return sw3;
    }

    public void setSw3(Boolean sw3) {
        this.sw3 = sw3;
    }

    public Boolean getSw4() {
        return sw4;
    }

    public void setSw4(Boolean sw4) {
        this.sw4 = sw4;
    }

    public Boolean getSw5() {
        return sw5;
    }

    public void setSw5(Boolean sw5) {
        this.sw5 = sw5;
    }

    public Boolean getSw6() {
        return sw6;
    }

    public void setSw6(Boolean sw6) {
        this.sw6 = sw6;
    }

    public Boolean getSw7() {
        return sw7;
    }

    public void setSw7(Boolean sw7) {
        this.sw7 = sw7;
    }

    public Boolean getSw8() {
        return sw8;
    }

    public void setSw8(Boolean sw8) {
        this.sw8 = sw8;
    }

    public Boolean getSw9() {
        return sw9;
    }

    public void setSw9(Boolean sw9) {
        this.sw9 = sw9;
    }

    public Boolean getSw10() {
        return sw10;
    }

    public void setSw10(Boolean sw10) {
        this.sw10 = sw10;
    }

    public Boolean getSw11() {
        return sw11;
    }

    public void setSw11(Boolean sw11) {
        this.sw11 = sw11;
    }

    public Boolean getSw12() {
        return sw12;
    }

    public void setSw12(Boolean sw12) {
        this.sw12 = sw12;
    }

    public Boolean getSw13() {
        return sw13;
    }

    public void setSw13(Boolean sw13) {
        this.sw13 = sw13;
    }

    public Boolean getSw14() {
        return sw14;
    }

    public void setSw14(Boolean sw14) {
        this.sw14 = sw14;
    }

    public Boolean getSw15() {
        return sw15;
    }

    public void setSw15(Boolean sw15) {
        this.sw15 = sw15;
    }

    public Boolean getSw16() {
        return sw16;
    }

    public void setSw16(Boolean sw16) {
        this.sw16 = sw16;
    }

    public Boolean getSw17() {
        return sw17;
    }

    public void setSw17(Boolean sw17) {
        this.sw17 = sw17;
    }

    public Boolean getSw18() {
        return sw18;
    }

    public void setSw18(Boolean sw18) {
        this.sw18 = sw18;
    }

    public Boolean getSw19() {
        return sw19;
    }

    public void setSw19(Boolean sw19) {
        this.sw19 = sw19;
    }

    public Boolean getSw20() {
        return sw20;
    }

    public void setSw20(Boolean sw20) {
        this.sw20 = sw20;
    }

    public Boolean getSw21() {
        return sw21;
    }

    public void setSw21(Boolean sw21) {
        this.sw21 = sw21;
    }

    public Boolean getSw22() {
        return sw22;
    }

    public void setSw22(Boolean sw22) {
        this.sw22 = sw22;
    }

    public Boolean getDiscontinued() {
        return discontinued;
    }

    public void setDiscontinued(Boolean discontinued) {
        this.discontinued = discontinued;
    }

    public String getDummysupp() {
        return dummysupp;
    }

    public void setDummysupp(String dummysupp) {
        this.dummysupp = dummysupp;
    }

    public Integer getDummycustCtype() {
        return dummycustCtype;
    }

    public void setDummycustCtype(Integer dummycustCtype) {
        this.dummycustCtype = dummycustCtype;
    }

    public Integer getDummycustPriceType() {
        return dummycustPriceType;
    }

    public void setDummycustPriceType(Integer dummycustPriceType) {
        this.dummycustPriceType = dummycustPriceType;
    }

    public Integer getFvNoitems() {
        return fvNoitems;
    }

    public void setFvNoitems(Integer fvNoitems) {
        this.fvNoitems = fvNoitems;
    }

    public List<Branches> getListBranches() {
        return listBranches;
    }

    public void setListBranches(List<Branches> listBranches) {
        this.listBranches = listBranches;
    }

}
