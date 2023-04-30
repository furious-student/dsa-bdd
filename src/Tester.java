import java.util.ArrayList;
import java.util.Arrays;

public class Tester {

    public static void main(String[] args) {
        BinaryDecisionDiagram bdd = new BinaryDecisionDiagram();
        long start;
        long stop;

        String s1 = "SFJNKDOGGTGFNLONQBSPDGIT+TK!CS!QNCJ!KDDQ!DCACCPFLDORPLK!BKBGKE+OSBCEFKHMDDHNNEKSNETBKHAP!QH+I!ISBPRBQF+AKMMAHALEJGKR!FHCFDPEJD+GHEF!GBIO!SNAGDNNNCNE+AF+I+R+C!NBNL+JJ!QS!O!HDCIGAH!KJ!DR+CMR+RHKT+GHDQG!NBM+FA!M+CCGLAI!HFHKHG!JIKRLMACJJE!EELBFA+A+JSH!KEOGLLQEDSDFKEFCJHB!L+GB+NCTF!MMOQMPDBBMPHJRCIRNQT+TN+HN+OH!AK!SPCB!L!SB!ESSH+P!IL!PFFBSOC!REAQGJ+TBQS+B+I!PAKQ+KKR+CTG+CSGHFRJBDLF+N!LMPMEJT+GHOR+FAE+TGFLOPJSCIIBKKJJFEESEFJMKKM!SGOBAMD!OFBLTP+DGTCRJNTAHGOHPGFGHHIDOMLTJK+SAP+DQBNJCOPA+FOJM!O+CQC!ROC+OTHQQI+FPAJPDKNJBIMKOFMQTPJCKFBTLIRI+CIN!EOSTP!EPOFGH+R!GJ+R+NTMSSFOGC!NSK!BPC+NTBF+NJEFEKK+INAPTPB+DAL+G!P!RD+G+REPLFTISA+BF!HJEDI!P+ROJHNKSE!Q!ADGBDLH+NGCIRKPGKJISHEP!BBGF!RI!TDCMOHGTNE+FKGEOAOP+IHH+FOCICFTMCQBR!BL!AOIQFH!MSII!AKQSB+PFMSPJNEIFOHTEF+E+FNCQQRBK+GFMRQHSL+GNTKRAF!KGE!QJEG!PP+COI!FMEJMNG!KD+NINNACBKNS+RODQHMR+GHT+H!MG!HAIGLIFNJQPATMGPKI+TLL!ESFO!IPNDITNCRIBOFLT!EKDCD!P+IKNCGKH!TMHBT!KEOGH+GEPQAO!HM!NNSMIR+QHDBSKONA+RS!JABT+M+KAI!LINJAIKQI+RGDTNQKEIJCFJT!KRAEGPKSH+JPLP!Q+MSHQ!SRMDQ+LOMT!NRBB!L!CBOQIDHNTLTRN+TITJLBTPNP+HCD+ATK+ET+BJJIN+FJMA!QHLNTH!EK+NJEDDDQ!I+OAJ+PNJEAR+HP+GMKSPAHIFFMJMBEI!PILBANDAJHAC+JQEBFFAC+F!HEN!DTPI!SAQ+RNFMMKERSD+O+HND+I!AFTBP+FELDKPNPIQ!F!ST!PSS+CNFHP!HEJHNJIMCAR!GSFDNC!STJONJJJ!RIKDIHPD!QCRB!D+LTMQ!FOPDKHMQATAFL+K!HBIISOLTNPPKFR!HNO!JNI!HGQFHTOGEHJLF+S!E+N!IRJSM!RJOPAOGOOS!GAERQQMJMHDOKCMCPRCOON!PHLJMH!N!J+GJEHGPOEKEKIFBETL!ACCJ+PQEJHOIAFF!DFRKIGH+C+TAB+IKGHGKISPCG+RRAC+SDJA+B!P+FITILKLFJDCNRFPBC!OQ!BT!M!HAOJG+PJ!K+DNLL+QNMNCHPDGEOGCJ!DMPSACOJ+MQKO+LRAG+JDHNIJ!TNO+QJK+S+GHJBGI+RC!FTS!N!SOKLKRHB!AEG+OHNO+QJRMKSNQQLEJMGGMQ!M!LCPIBC!R+SNR+EB!EE!NTLNGJQJOKIDJLAPD+SB+L+NTHPF+PA+FQ!D!H+SCPBMCPMNLMTRTICNGRMOTLTMFSJPOBRSPFK+QKD!D!R!TGILTLF+MRPRPDDQSPRJFTEM+JSJ!DKAIL!B+MRMFBO!GSHKT+HMBA+KMMPPLTE+H+ETIQTMEQHEB!BFTPIK!IH!J!PB!SFNRALPT+RQAFB!F+QR!ORPK+G!RPGOJ!DO+HR+IQP!SGK!H+E+QLC+IFNOA+IM!B+AQL+OCQ!GCJLB!RP!OLFFERNO+PC!NDK+ESBPJEATQ+K!H+BBNCARDAT+PFO!MAO!A+A!OBLQ+TRTI!R+NFKLPEJ!MNNB+AM!TFFJK+QNBHTR!ESOQ+PJLLLIRQDNFRTTIQDDGS!TKEHSRNFE!RI+T!AA!LM!QOR!L!G+QNJPCHKGGC!LLGI!I+AR!JLIK+IE!SR+QRBA+LNEHSQL+R!IPIPHCMCKIQ+FD+OGA!F+DSOCJKKARAHG!CGAPEFDPEF+ODAGC!JCHL!NGCF!BJPOEHM!QMHD!QJ+E!D+M+MED+LPSMR!EJC!DR+SILGK+LP+TSGMESH!SAT+FKHAMCRPTBOL+ITNDEMPRDGEFEDLMTFMH!S!JIMEF+TDIDRQIHLNSFM!SBEOP!E+LTLG+TRGRBISEJE!BOJ+JDFNNOK+MQOED+EDNK+T+F+BTAPPKLISDPM+QMQIMNMR+CEJS!OKBSREJKB+AJ!PH!OB+GINAN+EDT!EI!EEBBDKGADQ+JDCIKQE+OGNM!A+OMORN!KMEMKD+ER!RF+TQKLHLCF!CGACN!MLNQJHBBLOS!AISS!O+LSAGHBI+PRJE+II+EPOTJS+OSASDO!QQQRQMF!D!H!SDJSJMANRJE!HPRMKS!TOJBD+KESAGFBJONPQLATKOASTKBIIISD!H!DBHQ!JASLH!EKQESRICGO!SPDBIDM+TB+S!D+RNTFIQE+HGMPMNJ!C!JDPJMMN+ER+BDTB!FGFPGLBD+BHTGLITLJR!IIALF!NSFF+NPCQROERJ!GCETCSBHA+F!SDAQBHIFKAKA!TADGJG+RMKTK+CEICO!KDKBBO+ET!FEE!OCNLCBSMDBOE!H+GQ+EAQS!HCS!D!A!RRTG+DIJSP!KBIHJLLQOPPHP+FPFP+FCJ!HNDQBJIEBCEIJHEM+STN!QNBC!MKT+P+T+MSQ+KCIHJH+TOS!LIG!DRN!KIFFC!RO+TJ+LKEONISSMH!RHHIRRIR!L+HFM+FT+AG+EOTRBFLLBQQHRKQRTGQCLJKTMTDIHHA!KFCSIR!H+IHDK+PJMLMEBOGPEFFDC+C+NIJQIHJANO!TBO!NK+I+PACFF+C+HGGFNQM+JGC+FFAAJ!MAKKEKKQLA!GT!R+QPO!JIQN+KI!BGGEMIBOAPOPLKBDA!NTTCSTTRF+DDEH!GL+KQ!P+IR!T!JAEJRPPT!LJ+CGPBQEIN!C!I+M!N!DPIABL!CIJEQDGMDGH!JQTHHR+M!OLHD+NG!CDPB+KCRNODTLNTMNMAS!NGD!ENEHIO+BMAMB+HKS!RHEHMM!ITRLNNARJRBDH!RRBMRL!PAOFCN+GJNLB!QDOFTJMOL+NISO!LSNO!J!K+FQLTL!FEDJSERSA!C+MC+MAEC!GQI!CITQJQP!DTKPORG!G+MF+JHTJOB!CMKJDQPHSSEODANREHJHDIG!A+GMTKIO!MPM!H+DSE!RHLOH+LIBDCGTTEC+K+PG!HG!LQTED!C+GGGTN+M+OLC+FFIHFRH!AIGIDR+ER+FCFDCNQ!KILOHD+TDSLHLHTE+IE+ALHPIDC+SK+PB!BS+G+SDMITTP!JQPPEBIFEF+ISTNTRTIOKIAIGP!R+DHDI!HSLEBQRPFOMTO+IQETQB+I!HG!P!SBGDSRPG!JJNN!SJDSDIFTB!BNCGQRQIBQC!N+KQF!LKK!TALTIFSTOT+COE!MRJ+AKPDFOD!IHAO!PLFF+KKMG!LIG+BMRBDAO!MLEOO+ER!A+EMLPOHLNQMS+MKHNI!SOAIKNPSAR+BNRICQKEPH+IL!B!F!GHLI+SPPJ+CIMLLLRRO!JLMAB+Q!DQG+D+HCQDNMIGB+CJ+RAKAE!MKOTEB+PBGEFCAS!GQOOG!ALONCQ+JGS+KPPEGCTIKQEQDMHGFPBASTD!PLMTDNNSTIF+KBGTJMCKQFRF!RJKMELEDERIKBG!MO+PRK!K!B!RTTSFPJNFR!RNSNQPAOTOID+OF!HGQIEBRLNKKNEPDCT!BCAQDT+J+MBI+FD!RH+ONCT+SBOJBNKJT!PDEO!C!DNCMHA+JJCSK!QMMKAH+OTLKOTTCSSTGGKTF!CB!IK+JSH+NN+LH!B!QIFCHOBOL+OAFCIQF+F+TAOTMTTHDC+GHGLSSS!AJTOSA!KJ+F+HDKPRO!JN!M!NNQDASE+H+BR!M!RDIKRCM+OCPKDNFCOBDT!D+NMBFDPNBNMFIQKHFAC+DBJHJDG!PTE+FRNDL+CTLLK!JC!IDAAP+P+O!MNK+NE!O!B+PFDR+IGASJB+RPPTNMLIJMJ+MS!ACBESLJR!QG+QGHPGKFGCTNAPQFRKAJPG!BKACF!CKA!FLRDTDNRILOM+KKFSAFRBKSBJKFKEEDJOICPEHQPDTTGRP+ADNS+BRIHTCFETBLNLPJMCBJPL+C!DDBHQHEEFF!G!ISEFJCTDH!JE!ILSKLOMLFQ!B!ND!SBC!PMPCIMGIA+CS!N!S+I!NPT!APTP+M+S+BHLIPFC+M+J!KBKHKH!MDPGF!B+QBQATKS!A!EB+GPJNK+P!ECRKSBGQ!RL!GCTAE+TMGAOC!QA!PLF!BLAA!NH!CPJKJ!SJRI+K!GR+LNNOI!FK+A!BOLN!S!JOK+TFMSK+QGPRC!C!NIM!QMBSQIGHT!QNHN+MNI+BLS+NCQC!DLBED+SKFGA+MI+RSKQ+LBKDB+AHLADM+JT+C!FNBJRMMFTPLJ+GCMS!AREC!AOF!KCHTFCN!FDCEB+O+ES!NS!P+ANNDBB!N+EFGBO+GTJ+TAIP!PBPQEAK+QPTTDFMMALBQTHNOGNLLFR!TDBS+ND!KHHRQKSTT+MNI!EKQBKI+GII+KRHNAEIMORG+CRP!BSD+GFMTLGNGL!TMHSIB!T!EKSCDBGAIK!EK!MLEDQLE!Q+LKAJHDDFLEO+NA!EBEM+HDRAKPKAI+KB!BORNDHT+TNINSDQOIB!L+ILS!SPJ!D+LG+LITNDQ+QOSPHAMI+FHKPDHDIJ+ME!SIOOSFML!PECCOBCCBHACLEKC+FD!LM!C!ANJBTMHEGHMLHHAADOMG!IIEC!SMB!JTKETG!FGQGTQ!PPOJQTBRSOLCNSS!FEGOK!SF+NF!T+DFAJSJPOJ+PJNSA!PLBF!FJPFKT+QMDSPETSPPA+JE!LDD+J!KDLILOGJFBQKQA!KDEJNJR+RISIHQ!HNC+OLHBH!RMMB!SP!JLFNBQCN+KT+LTLJNOCIBNN+ACDLT!SBH+HTAFCOCBO+PFPAI!QDNDAGGDGRNPAFFJBOEB+H!RESFGHKJSPQDINHTS!QNM!LMPMB!ADFGO+DEOITRRJ!TONRMTJBSJRLID+EIBBAHQM!FBH+SNEPJNKPI+DQHCF!A+O!T!JT+R!HA!E+KCL!H+GD!P+B+AR!A+SPKRTOOANRO+HKERNKRDHIBH!LB!QAEMJF+R+E+TAF+OSSG+F+JFHGDPAOCCI+THRN!A!NK!P+HTRETNSIGF+E!DSM+M!STDGDDSHLNIPMNDNJL!K!TTDDPPBQESDND!I!CMKJBMFMGDGADROFEJ+LTJJ!T+RGRJI+T+TRSLO!LHJST+S+IKAEEP!S+SKDTFA!DTMGGJMM!Q+MLRKDRMRMLNFAM!ND!AD!BI+HNNQJMNMJEKK!ATCDN!J+NBJSLICFRAOQ!A!QKP!SNGLNBDIKABBMDBOSPMJLESBP!EGCO+RBGOCGQTTKQEDQIROQDCJQQMCN!BAR+O+SHNJKRFR!ES+FKC+SRDCEFKFBCTJ+LBOD+FTEOGRHTRJL+GN+C!QKINIE!H!PPJJ+PAT!TMCTN+TEFDNNCSFT+P!A+BJOQKROATA+K!JG+NGAKN+NOPNIHLKR!NIOETC+EFKG!IHJSSADNTLL!MIQBKHQFAG!AACPRBHIRTJDHFJ!MM!R+FLSJ!RA+LJ!P!RMMBSDR+IEQR+A+FHLPFEGGBKJDEBK+OIACFG+LOCBNNBJMRMJRNFCKMEGDEHHJPEBB!QHF+T!JFT!G+RA!RI+LSDNTQDP!CGHFP+D+MK+M!TJELKHNIGIPSCPFCE!CRTBHJ+FPH!OQT+FAB!JAFIQRBRK+PMJICOOT!K!IRBIFDSPR!NCOEOTPEBQHBDTNTPRLR!TCAQ!BS+PG+ACD+KM+FNCQRCKOS!SMRA!GQ!BSK+RSH+CNSGND+L+B!H!SGA+HJ!GLC!LH!PPKTKJ+NQTR+F+ROQQTOE!C!PRTAC!F!IHSOLCFOJF+GAJ!EETH!CL+PJM!NHIHRMTONONGNJ!RM+J!RJGTO+A!IQSGJ!LDPTGHNADL!AQ+SIDEHLHJFG+KIIO+DIRP+RQAR!FEM+CRFFJ+I+JICRA+EMFGLPIJMDTFO+PF!P+IGA!AB!DGSMCMBKAA!FLFCBOFLJMPTGM!GQ!M!MDCR+PFM!MPTKKEFLGTMQOBPDNAF!TT+IIGP!NBO+TGAS!ANEH!BDHKNQ!LJ+O+LANO+S!P!QPJN+ABE+S+SSQOS+TLD+N!JIDLNPCCDEKDDCOBJHKHJKAPLRK+QL!PHP+DG!G!RBQ+G!AF!SLDCINP!IPGC!PBCAD!LGDCQ!KDCS!EC!IAGNOEIELJ+DEFND!BFMOHQ+LI+JGFJ!GFOKE!CI!R+H+BG+OG+S!BBSJGLEQP!CIGTCBEMGKL+DT!H!OLBL!SQFH+FJAJ+JIMLJKHBEQLFKT!B!TPT+KLA!EIN!BMSOABON+DDHRNTFCLIODT!BGB!OSGDE+JSCTICSB!NCKAOLMBBIK!SHJAOTKNE!B+IPM+HGDDT+F+PHKB!SQAQELTJCILCGCIJ+FSRL!HMQKIPTPLRRD+TE!EIJOEACIMA+AA!MAF!BHCCQ!TAFS!B+MA!TLF+KJHQIOOEMD!Q!SOMHO+JI!KTS+MCGTRS!DD!FBLO+PE!QGBGDKRKI!L+MSRNMP+A!PHPHA+MOSSKA!P!PNSOESN+DDCTIBML+RBOP!OL!FJM+DJDCAF!A+ANAJNOGQAKBOMF!HTL!SSSFHLQRFAM!SISKTFFT!OKM!GMFHF!OF+LBCH!FM+TDSETQS+T!EKICS+JFSDOKED!CQB+HG+O+M+ORA!NIL+ABFMBJN!FEEF!HFDIQ!JITHTGFFJL!JLT!OMFDA!JIHN!CRMS!KO+GP!TNI!NJTNIEKAJASA!R!TAHQJBDA+D+MTJD!LLFMNTHGC+E+GNMTTLP!S+GRP!DKDFEDSE!KFR!NJKDMSOONS!S!G!FESQHOHJE+RL+DF!GBTMD+MDO!SLPCDGOTDBJAQTPS+FA+SRCHFSQO!PLB!LIAELFHSGP+DEHLPHDPJATFM+KJ+HEEDJTCKHGIK!M!O+FFS!KCEILOCII+KQIOSBA+K+LBGTRQ+B!PBB!T+SJTCAQOGREBCHT+LEG!RTLLNCNILQKOJHRJL+PMLMCF+NTB+CEMHP+KSRBDH+CF!GIE!TOFAAPTLQRIH!ROBOE+S!OBKB+GJSTDBHP!SKDTTMHSRDQKB!IJCENDIHRTBFT+C!NNH!KL!SPPNEJTG+KTTBHB!OB+OPH!CMCEFEAPMO!BT!MOEIFSORMAADTQDCOCO+H+KMMSSL!HKFTL+HRRRO!QGNBTEPN!EBGPB!GCHQFFHR!LC+PKGAJ+DHTI+PSLHS+P!MQR!TJHJNSJBKQ!PGO!JQPSHL!TJQMIHHIPMDNDOPREH+SNFG!TFG!PPL!MSIB+BFD!E+RDT+Q!KT+AAGKDERM!MMKFBCNL!NEHITRKSHPH+CDNEPNLJILABCO+RD+AAEPMN!D+E+PH+A!KKKTTG!B+EBBGJG!GPHOM+KIN+NHLQ!BF+DLACHF+GBDC+ESFM!FPDD!LS+AJ+PTDIBMBREETMT+Q+B+HMDB+GN!PITBSM+CDH!SPHOQS!DNOAF!COAQTQ!RQEEBIESM!FH!FIKT!ENTCOO+ABECM+HMHL!DCABB+MMRHL+RA+PSBTPAFR!KAGJAB!C!HCLIIO+H!IS+FJEGQBEEMPRTRSSE+PQ+L!EESHLQ!RR+QTMMAT+TCB+D+DD+O!PEB+NL+ERBROKORRSOEE!NEPGRDJ!QTM+AP!GRN+NNJBKNEG!D+OHATQDTA!S+M!LTDSSNJDRP+RI+GLJPSPGTD+Q!CIHPLGCNQGSCS!ELHEIS!HO!ODHNBTANBEBQT!QRKOIID+GB+FNSOLC!QOFHDDEB+E!TTG!PD+RKB!STQIN!I!SAE!PHFPDATJQSNLM+JQF+EH!EDHGGLRAENC+TAKSJKAOPMFO!AETSDRG!B!NS!IFII+E+MK+O!RBN+GDLLC+ATRDC+G!S!PN+MDPR+BTDTSMPKTOJSP!CFFJK+CQ!AIAHPF!MSJG!EAKDSDBHMJ!LHJ!B+E+A+F+CE!JL+NA+L!P+KAT+KI!Q!JSCTBATSPTDTIPNHAESQEBT+A+DAODFFDDPAJOF+QELHIBAM!NSGJQ+INE!JR!B!ASJFOLNT+BGP+HLGTJSEIIKJMP+IRTDJTEPS!R+ENHTN!O!RG+KB!ALLCDRIGCENESEHRROR!PJDRE!JMNQL+SFLF!DS+O!AJIT!BEG+RMBNFJPKMDM+J+FCAISAC!TETARO+ON+F!QB+HOLM+KDII+PMOMBQH+ATSKDM!T!JDEBJ!RSSLDQQB+MPFMOPC!AQ!RCG!TG+BJN+KRDQLEJ+MRNIRAKRAITBMKJSG!OJHTRAGDI!DRTCN+HDKTFFBEBLEBB+P!CQEIF!BM!O!BNCF!FKRTDAQ+NILAIMSI+JQH!CGPSP!NDR+P+RP+Q+QSNJFFERAGJBCJL!KSNBPELSLFSF+DPJDM+NNTITAMA+RGKOS+AKGKTKA!S+PNAPQJCPOSEDCLKDG+SEOQDMHJLOCTLB+NNLGTOGC!AF!OS!DJ!IBME+N+CA+BSCHHOQ+DITAQ!MLASG+PRC!QNF!D!E!NOSHBKMJAI+I!O!GEJBS+P+S+MRLEINKLF+GDAAPELTD!K!F+KPERJ+ORH!KLHEJIKFD!QJHS+RRAR+MT!OSB!NKISC+S+EHKROK+GCINB+OL+M+ADF+LQOINTKQAMNK!I!D!MCE!BDMKBFN!L+B!C+EBPRMOEN!NF!ONNKE!F+GPODPERTEJNJ!OCGBKGR+JFPHIGQRE+ISH!FFSLTGE!JIPS!T!PNAKTALFTR+K+HHABKHBAJGA+IE!LJ!JKIO+TNDGNDN+RJHTQHNKOLMDK!LPHJMAA!IHK!GNBNT!LDK!IOPSCSEIGTGHEHPPLM+L+Q!MQBAOT!CR+CGMNTLAEOP+LDHJ+JLBFR+QLJMAHORIEBAHO+MHK+IMNN!TDRO!MDHD+FDDNHPL!JJTFNERHONRPTRIMSBDRPJQNEOTBIKBPEP+OAFMESNLI!OPIMOE!MDJKMF!KHLTG!LGTEPTHT+ACQ+G!T+SBAGNODRPEKKK+GSNQEATGT+M!IJBQTIDAFIBM!J!SSSP+AT+PCPCMSIHI!HQOML+NHDI+SJPM+AFJPGFO+Q!CB!ACHGSSGLCRENHRPGQFPSQJQOK!TC+QSQ!M+JKTMH!FSJDO+KC+AG!BEF+LQQQ+FGSJSBH!O!HEKBM!CGQ+LNCMSICPIHQCQERIK+K+C+B!O+FSPJHKBOGO+A+S+CQTOPBPLTGGSQLLS+IDPS!OR!CL+GGIJ+OL!TSSA+DODFSLS!OKSLPG+PPD!K!KEQHRHGB!KMOSEIM!SO!JCMOD!JEDIBKOPK+RKQLBOS+KJ+CFJNNFQMCMKQTFFD+GP!LS!OE!M!MTS+IJEBRHAJSKDQM!TA!CD+FPLOSHC!ASEQM!T+JITBSTLGF!LDKR+CMBS+GHEF+DA!MOSS!FPCRAT+BPTP!QMAMFAL!K!E+MAQ!DTPFK+OO+S!O+TKAN!ANIRFJB!EBAN!GEKNBTTLM+B!LS!SOJ+JCPN+QFSODRSC+RFIIOFGEBC!DELHRPFPRB!IOIDDQ!K!OEBABSLGFMEB+OKCHK!RG+GN+HLBDOCRBNCTKNTCHRNS!KRLLC!AO!NT!CFQJFRFMELJ+LOP+C!GRNI+OTLRHKR!ALE!DTBAGESD!E!QINETADOF!KFIMMFII!OIEPHJFG!QAJRJBAKCHSSOR+T!KRQRIG!LGKSS+OOLPJ+PKEJ!TFMNNLCE+IIFPDT+OJ+POSKG!P!LLMTHGGGJ+O!BDGOEJC!BD+NGCRLM!ECT+HHJGLSDIGF+QBRHAK+GPSEIIS+COQC!KLHHAQKCTPECITAAEGJHEFKEDM+ACKPE+BQFANOQSE+JM!IGCFEAEC!N+LH+BD+PSQHOT+S!EB+PJDNSE+MNFN+BIR!KD!QTH+G+OPA+FS!RE+KKL+TAMPAOGTKOEGGQR!OQ+HJHRT!DHR!RHJ!KINH+RB+KQMBRE+CEAGBC!JB!RBEPGFIGS+I!G!FOQFGFTDFDJCQDQ!TGE+RP!FR!MSPBSJO+RFKMM+JECRBLJOBITJJBB!HKINHQTE!DRAFS!RFMFDDN!RRHJOOBLDJRGDDPJOR!C!OG+NB!JPPG!GQJT+M+RAAHAJLOR!AJF+QHEQMI!SSRIKELBAEJ+GPK+NKP+OPDF+LB!S!ANA+N!L!NRE+DOLBCR+S+SEH!NRJC+IKILBJDAEBH!BPSQQMMFEOKOO+HISKAJEBRMF+LGHOTFTJ!TG!SNBKS!QJMGB!QQFMIMA+KIJD!N+KAIR+EKO!JGFHOG!NN+M!MA!MDNMNBJ!JG!IBIDGHEFEKQ+LNQHPN+LDG!LEJTSKNCEIFABPNMCBSPPDN+BDBLPITHDSQSCDJTNANFGIADJP+KHSLSBI!Q!FT+PQN!NRR+R!J!HBLSO+PDM!LBCIAJEKAJQSB!BTI+DQFHAI+FC+K!S+ABELLGCL+EHNNBD+TOC!JSIQGH+SSH!FODD+SMRMPNG+SOE!QFPHLJPSCAPLMIQNE+CCFPOPGHIBQEIJDKEQHRFCDH!MKKIG+RLEOMPEJAQPMQJHT+KODPORRSHNCBOANG!KG+HHN!DFJ!MBKTEMIBQNBA+SD!JEIKTO!ARHRSJJSNLA+GKBIGRLCLBEQ!JBLLBJRGFSDMLSHQAO+LGMMQDP!BPSJRNNEBQ+QK!I!ONO!Q!K+JCIHM+ADEH+J+E+HOOPOH+COBESHANTMK+TSEI!OLA+SB+I!QFQFDOOGPECKF+IJQFF+SOF+P+DC+P+S+HAATG+J+T+CTNIHQ!BJKBNSPACGSPSJKINMHAAKDOGPBM+TAELHRHDEKMQOEBNGD!OMLN!FMGG!PMI+LT!RAR+A!EAJFRHIRK!SDSAQJS!QRJ+NNRQDDCICKTTDQMBO+SFCBDQTMN!IBIKEG!RMCM!GAT+G+IM+P+LNDOEMEBDNPHH!JJEKHPLHRJ+LPLJGSM+SK!B!JSILDHGNKFQFBFNEIDNI+D!BO!FLDIGKM!SSKGJFNTGFHK+KRNJRFRSCPL!NDODADDCGJPN+LE+MFLIPLBEMNCHRQI+PG!QIETO+EJMO+K+QKAKMI+GOLQLCOSEENJ!HMD+HMD+KLADS+B+FFCBIJFDF!PANIG!AP!IPQSJO+MIHFIDJQS+C!NJJSH!JRPL+DTIM+H!FKPMSKFITFBKJJIPECPBDSOD+MPLCO+H!BFTHAM+FAI!AT+HGPA+HNTEGCM+ETEBO!HRD+PPEOLBM+AN+ESEQASIHIH!I!MFPIFLHK!MHTDBTQH!DGEBHECKSNATNSAGCL!SLEBJPGGNOJSMPLE!I+PTMTPMSTGAAAR+GDTPE+IRC!C!AS!I!IRAKGLJNEJHDQ+P!O+CF+HKSFFSCIL!I!O+H!GRCFJGDCL+RTF!FIL!HJ+JF!D!IOQS+HHPO!SPIKPRIHDQBGPABO+NP!ASGAS!BDEHR!IP+QQP+FI+FFPODG!IJKOCJ!QB+QE!FAK!IFOR!HRDEELB!FBA!IKG+RCM+DO!FFPEOEKIL!SBPEDLIPM!RB+L+NO!BASGNHQEMKNKOG!SOOEJ+MKNJJJFKER+JT!MT+HFND!QDQEA+DLSPLIMKQOIHC!JFPME!QC!D+C!T!FBFAQJFTGETQ!QNJ!SJN!S!N!OQBDBKJQSEIGDNG!TDMJEQGTH!DLFS!FBS!CR!NQK+FLTKQMJLDLN!MDRI+T+JJSE!L!GD+MK!NPPNQJ+T+ETOEF!M!FANENTFI!L";
        String s1_2 = "TK!CS!QNCJ!KDDQ!DCACCPFLDORPLK!BKBGKE+ABJIK+!A!BCE+ATHJIKBS+ABHIJKL+SFJNKDOGGTGFNLONQBSPDGIT+OSBCEFKHMDDHNNEKSNETBKHAP!QH+I!ISBPRBQF+AKMMAHALEJGKR!FHCFDPEJD+GHEF!GBIO!SNAGDNNNCNE+AF+I+R+C!NBNL+JJ!QS!O!HDCIGAH!KJ!DR+CMR+RHKT+GHDQG!NBM+FA!M+CCGLAI!HFHKHG!JIKRLMACJJE!EELBFA+A+JSH!KEOGLLQEDSDFKEFCJHB!L+GB+NCTF!MMOQMPDBBMPHJRCIRNQT+TN+HN+OH!AK!SPCB!L!SB!ESSH+P!IL!PFFBSOC!REAQGJ+TBQS+B+I!PAKQ+KKR+CTG+CSGHFRJBDLF+N!LMPMEJT+GHOR+FAE+TGFLOPJSCIIBKKJJFEESEFJMKKM!SGOBAMD!OFBLTP+DGTCRJNTAHGOHPGFGHHIDOMLTJK+SAP+DQBNJCOPA+FOJM!O+CQC!ROC+OTHQQI+FPAJPDKNJBIMKOFMQTPJCKFBTLIRI+CIN!EOSTP!EPOFGH+R!GJ+R+NTMSSFOGC!NSK!BPC+NTBF+NJEFEKK+INAPTPB+DAL+G!P!RD+G+REPLFTISA+BF!HJEDI!P+ROJHNKSE!Q!ADGBDLH+NGCIRKPGKJISHEP!BBGF!RI!TDCMOHGTNE+FKGEOAOP+IHH+FOCICFTMCQBR!BL!AOIQFH!MSII!AKQSB+PFMSPJNEIFOHTEF+E+FNCQQRBK+GFMRQHSL+GNTKRAF!KGE!QJEG!PP+COI!FMEJMNG!KD+NINNACBKNS+RODQHMR+GHT+H!MG!HAIGLIFNJQPATMGPKI+TLL!ESFO!IPNDITNCRIBOFLT!EKDCD!P+IKNCGKH!TMHBT!KEOGH+GEPQAO!HM!NNSMIR+QHDBSKONA+RS!JABT+M+KAI!LINJAIKQI+RGDTNQKEIJCFJT!KRAEGPKSH+JPLP!Q+MSHQ!SRMDQ+LOMT!NRBB!L!CBOQIDHNTLTRN+TITJLBTPNP+HCD+ATK+ET+BJJIN+FJMA!QHLNTH!EK+NJEDDDQ!I+OAJ+PNJEAR+HP+GMKSPAHIFFMJMBEI!PILBANDAJHAC+JQEBFFAC+F!HEN!DTPI!SAQ+RNFMMKERSD+O+HND+I!AFTBP+FELDKPNPIQ!F!ST!PSS+CNFHP!HEJHNJIMCAR!GSFDNC!STJONJJJ!RIKDIHPD!QCRB!D+LTMQ!FOPDKHMQATAFL+K!HBIISOLTNPPKFR!HNO!JNI!HGQFHTOGEHJLF+S!E+N!IRJSM!RJOPAOGOOS!GAERQQMJMHDOKCMCPRCOON!PHLJMH!N!J+GJEHGPOEKEKIFBETL!ACCJ+PQEJHOIAFF!DFRKIGH+C+TAB+IKGHGKISPCG+RRAC+SDJA+B!P+FITILKLFJDCNRFPBC!OQ!BT!M!HAOJG+PJ!K+DNLL+QNMNCHPDGEOGCJ!DMPSACOJ+MQKO+LRAG+JDHNIJ!TNO+QJK+S+GHJBGI+RC!FTS!N!SOKLKRHB!AEG+OHNO+QJRMKSNQQLEJMGGMQ!M!LCPIBC!R+SNR+EB!EE!NTLNGJQJOKIDJLAPD+SB+L+NTHPF+PA+FQ!D!H+SCPBMCPMNLMTRTICNGRMOTLTMFSJPOBRSPFK+QKD!D!R!TGILTLF+MRPRPDDQSPRJFTEM+JSJ!DKAIL!B+MRMFBO!GSHKT+HMBA+KMMPPLTE+H+ETIQTMEQHEB!BFTPIK!IH!J!PB!SFNRALPT+RQAFB!F+QR!ORPK+G!RPGOJ!DO+HR+IQP!SGK!H+E+QLC+IFNOA+IM!B+AQL+OCQ!GCJLB!RP!OLFFERNO+PC!NDK+ESBPJEATQ+K!H+BBNCARDAT+PFO!MAO!A+A!OBLQ+TRTI!R+NFKLPEJ!MNNB+AM!TFFJK+QNBHTR!ESOQ+PJLLLIRQDNFRTTIQDDGS!TKEHSRNFE!RI+T!AA!LM!QOR!L!G+QNJPCHKGGC!LLGI!I+AR!JLIK+IE!SR+QRBA+LNEHSQL+R!IPIPHCMCKIQ+FD+OGA!F+DSOCJKKARAHG!CGAPEFDPEF+ODAGC!JCHL!NGCF!BJPOEHM!QMHD!QJ+E!D+M+MED+LPSMR!EJC!DR+SILGK+LP+TSGMESH!SAT+FKHAMCRPTBOL+ITNDEMPRDGEFEDLMTFMH!S!JIMEF+TDIDRQIHLNSFM!SBEOP!E+LTLG+TRGRBISEJE!BOJ+JDFNNOK+MQOED+EDNK+T+F+BTAPPKLISDPM+QMQIMNMR+CEJS!OKBSREJKB+AJ!PH!OB+GINAN+EDT!EI!EEBBDKGADQ+JDCIKQE+OGNM!A+OMORN!KMEMKD+ER!RF+TQKLHLCF!CGACN!MLNQJHBBLOS!AISS!O+LSAGHBI+PRJE+II+EPOTJS+OSASDO!QQQRQMF!D!H!SDJSJMANRJE!HPRMKS!TOJBD+KESAGFBJONPQLATKOASTKBIIISD!H!DBHQ!JASLH!EKQESRICGO!SPDBIDM+TB+S!D+RNTFIQE+HGMPMNJ!C!JDPJMMN+ER+BDTB!FGFPGLBD+BHTGLITLJR!IIALF!NSFF+NPCQROERJ!GCETCSBHA+F!SDAQBHIFKAKA!TADGJG+RMKTK+CEICO!KDKBBO+ET!FEE!OCNLCBSMDBOE!H+GQ+EAQS!HCS!D!A!RRTG+DIJSP!KBIHJLLQOPPHP+FPFP+FCJ!HNDQBJIEBCEIJHEM+STN!QNBC!MKT+P+T+MSQ+KCIHJH+TOS!LIG!DRN!KIFFC!RO+TJ+LKEONISSMH!RHHIRRIR!L+HFM+FT+AG+EOTRBFLLBQQHRKQRTGQCLJKTMTDIHHA!KFCSIR!H+IHDK+PJMLMEBOGPEFFDC+C+NIJQIHJANO!TBO!NK+I+PACFF+C+HGGFNQM+JGC+FFAAJ!MAKKEKKQLA!GT!R+QPO!JIQN+KI!BGGEMIBOAPOPLKBDA!NTTCSTTRF+DDEH!GL+KQ!P+IR!T!JAEJRPPT!LJ+CGPBQEIN!C!I+M!N!DPIABL!CIJEQDGMDGH!JQTHHR+M!OLHD+NG!CDPB+KCRNODTLNTMNMAS!NGD!ENEHIO+BMAMB+HKS!RHEHMM!ITRLNNARJRBDH!RRBMRL!PAOFCN+GJNLB!QDOFTJMOL+NISO!LSNO!J!K+FQLTL!FEDJSERSA!C+MC+MAEC!GQI!CITQJQP!DTKPORG!G+MF+JHTJOB!CMKJDQPHSSEODANREHJHDIG!A+GMTKIO!MPM!H+DSE!RHLOH+LIBDCGTTEC+K+PG!HG!LQTED!C+GGGTN+M+OLC+FFIHFRH!AIGIDR+ER+FCFDCNQ!KILOHD+TDSLHLHTE+IE+ALHPIDC+SK+PB!BS+G+SDMITTP!JQPPEBIFEF+ISTNTRTIOKIAIGP!R+DHDI!HSLEBQRPFOMTO+IQETQB+I!HG!P!SBGDSRPG!JJNN!SJDSDIFTB!BNCGQRQIBQC!N+KQF!LKK!TALTIFSTOT+COE!MRJ+AKPDFOD!IHAO!PLFF+KKMG!LIG+BMRBDAO!MLEOO+ER!A+EMLPOHLNQMS+MKHNI!SOAIKNPSAR+BNRICQKEPH+IL!B!F!GHLI+SPPJ+CIMLLLRRO!JLMAB+Q!DQG+D+HCQDNMIGB+CJ+RAKAE!MKOTEB+PBGEFCAS!GQOOG!ALONCQ+JGS+KPPEGCTIKQEQDMHGFPBASTD!PLMTDNNSTIF+KBGTJMCKQFRF!RJKMELEDERIKBG!MO+PRK!K!B!RTTSFPJNFR!RNSNQPAOTOID+OF!HGQIEBRLNKKNEPDCT!BCAQDT+J+MBI+FD!RH+ONCT+SBOJBNKJT!PDEO!C!DNCMHA+JJCSK!QMMKAH+OTLKOTTCSSTGGKTF!CB!IK+JSH+NN+LH!B!QIFCHOBOL+OAFCIQF+F+TAOTMTTHDC+GHGLSSS!AJTOSA!KJ+F+HDKPRO!JN!M!NNQDASE+H+BR!M!RDIKRCM+OCPKDNFCOBDT!D+NMBFDPNBNMFIQKHFAC+DBJHJDG!PTE+FRNDL+CTLLK!JC!IDAAP+P+O!MNK+NE!O!B+PFDR+IGASJB+RPPTNMLIJMJ+MS!ACBESLJR!QG+QGHPGKFGCTNAPQFRKAJPG!BKACF!CKA!FLRDTDNRILOM+KKFSAFRBKSBJKFKEEDJOICPEHQPDTTGRP+ADNS+BRIHTCFETBLNLPJMCBJPL+C!DDBHQHEEFF!G!ISEFJCTDH!JE!ILSKLOMLFQ!B!ND!SBC!PMPCIMGIA+CS!N!S+I!NPT!APTP+M+S+BHLIPFC+M+J!KBKHKH!MDPGF!B+QBQATKS!A!EB+GPJNK+P!ECRKSBGQ!RL!GCTAE+TMGAOC!QA!PLF!BLAA!NH!CPJKJ!SJRI+K!GR+LNNOI!FK+A!BOLN!S!JOK+TFMSK+QGPRC!C!NIM!QMBSQIGHT!QNHN+MNI+BLS+NCQC!DLBED+SKFGA+MI+RSKQ+LBKDB+AHLADM+JT+C!FNBJRMMFTPLJ+GCMS!AREC!AOF!KCHTFCN!FDCEB+O+ES!NS!P+ANNDBB!N+EFGBO+GTJ+TAIP!PBPQEAK+QPTTDFMMALBQTHNOGNLLFR!TDBS+ND!KHHRQKSTT+MNI!EKQBKI+GII+KRHNAEIMORG+CRP!BSD+GFMTLGNGL!TMHSIB!T!EKSCDBGAIK!EK!MLEDQLE!Q+LKAJHDDFLEO+NA!EBEM+HDRAKPKAI+KB!BORNDHT+TNINSDQOIB!L+ILS!SPJ!D+LG+LITNDQ+QOSPHAMI+FHKPDHDIJ+ME!SIOOSFML!PECCOBCCBHACLEKC+FD!LM!C!ANJBTMHEGHMLHHAADOMG!IIEC!SMB!JTKETG!FGQGTQ!PPOJQTBRSOLCNSS!FEGOK!SF+NF!T+DFAJSJPOJ+PJNSA!PLBF!FJPFKT+QMDSPETSPPA+JE!LDD+J!KDLILOGJFBQKQA!KDEJNJR+RISIHQ!HNC+OLHBH!RMMB!SP!JLFNBQCN+KT+LTLJNOCIBNN+ACDLT!SBH+HTAFCOCBO+PFPAI!QDNDAGGDGRNPAFFJBOEB+H!RESFGHKJSPQDINHTS!QNM!LMPMB!ADFGO+DEOITRRJ!TONRMTJBSJRLID+EIBBAHQM!FBH+SNEPJNKPI+DQHCF!A+O!T!JT+R!HA!E+KCL!H+GD!P+B+AR!A+SPKRTOOANRO+HKERNKRDHIBH!LB!QAEMJF+R+E+TAF+OSSG+F+JFHGDPAOCCI+THRN!A!NK!P+HTRETNSIGF+E!DSM+M!STDGDDSHLNIPMNDNJL!K!TTDDPPBQESDND!I!CMKJBMFMGDGADROFEJ+LTJJ!T+RGRJI+T+TRSLO!LHJST+S+IKAEEP!S+SKDTFA!DTMGGJMM!Q+MLRKDRMRMLNFAM!ND!AD!BI+HNNQJMNMJEKK!ATCDN!J+NBJSLICFRAOQ!A!QKP!SNGLNBDIKABBMDBOSPMJLESBP!EGCO+RBGOCGQTTKQEDQIROQDCJQQMCN!BAR+O+SHNJKRFR!ES+FKC+SRDCEFKFBCTJ+LBOD+FTEOGRHTRJL+GN+C!QKINIE!H!PPJJ+PAT!TMCTN+TEFDNNCSFT+P!A+BJOQKROATA+K!JG+NGAKN+NOPNIHLKR!NIOETC+EFKG!IHJSSADNTLL!MIQBKHQFAG!AACPRBHIRTJDHFJ!MM!R+FLSJ!RA+LJ!P!RMMBSDR+IEQR+A+FHLPFEGGBKJDEBK+OIACFG+LOCBNNBJMRMJRNFCKMEGDEHHJPEBB!QHF+T!JFT!G+RA!RI+LSDNTQDP!CGHFP+D+MK+M!TJELKHNIGIPSCPFCE!CRTBHJ+FPH!OQT+FAB!JAFIQRBRK+PMJICOOT!K!IRBIFDSPR!NCOEOTPEBQHBDTNTPRLR!TCAQ!BS+PG+ACD+KM+FNCQRCKOS!SMRA!GQ!BSK+RSH+CNSGND+L+B!H!SGA+HJ!GLC!LH!PPKTKJ+NQTR+F+ROQQTOE!C!PRTAC!F!IHSOLCFOJF+GAJ!EETH!CL+PJM!NHIHRMTONONGNJ!RM+J!RJGTO+A!IQSGJ!LDPTGHNADL!AQ+SIDEHLHJFG+KIIO+DIRP+RQAR!FEM+CRFFJ+I+JICRA+EMFGLPIJMDTFO+PF!P+IGA!AB!DGSMCMBKAA!FLFCBOFLJMPTGM!GQ!M!MDCR+PFM!MPTKKEFLGTMQOBPDNAF!TT+IIGP!NBO+TGAS!ANEH!BDHKNQ!LJ+O+LANO+S!P!QPJN+ABE+S+SSQOS+TLD+N!JIDLNPCCDEKDDCOBJHKHJKAPLRK+QL!PHP+DG!G!RBQ+G!AF!SLDCINP!IPGC!PBCAD!LGDCQ!KDCS!EC!IAGNOEIELJ+DEFND!BFMOHQ+LI+JGFJ!GFOKE!CI!R+H+BG+OG+S!BBSJGLEQP!CIGTCBEMGKL+DT!H!OLBL!SQFH+FJAJ+JIMLJKHBEQLFKT!B!TPT+KLA!EIN!BMSOABON+DDHRNTFCLIODT!BGB!OSGDE+JSCTICSB!NCKAOLMBBIK!SHJAOTKNE!B+IPM+HGDDT+F+PHKB!SQAQELTJCILCGCIJ+FSRL!HMQKIPTPLRRD+TE!EIJOEACIMA+AA!MAF!BHCCQ!TAFS!B+MA!TLF+KJHQIOOEMD!Q!SOMHO+JI!KTS+MCGTRS!DD!FBLO+PE!QGBGDKRKI!L+MSRNMP+A!PHPHA+MOSSKA!P!PNSOESN+DDCTIBML+RBOP!OL!FJM+DJDCAF!A+ANAJNOGQAKBOMF!HTL!SSSFHLQRFAM!SISKTFFT!OKM!GMFHF!OF+LBCH!FM+TDSETQS+T!EKICS+JFSDOKED!CQB+HG+O+M+ORA!NIL+ABFMBJN!FEEF!HFDIQ!JITHTGFFJL!JLT!OMFDA!JIHN!CRMS!KO+GP!TNI!NJTNIEKAJASA!R!TAHQJBDA+D+MTJD!LLFMNTHGC+E+GNMTTLP!S+GRP!DKDFEDSE!KFR!NJKDMSOONS!S!G!FESQHOHJE+RL+DF!GBTMD+MDO!SLPCDGOTDBJAQTPS+FA+SRCHFSQO!PLB!LIAELFHSGP+DEHLPHDPJATFM+KJ+HEEDJTCKHGIK!M!O+FFS!KCEILOCII+KQIOSBA+K+LBGTRQ+B!PBB!T+SJTCAQOGREBCHT+LEG!RTLLNCNILQKOJHRJL+PMLMCF+NTB+CEMHP+KSRBDH+CF!GIE!TOFAAPTLQRIH!ROBOE+S!OBKB+GJSTDBHP!SKDTTMHSRDQKB!IJCENDIHRTBFT+C!NNH!KL!SPPNEJTG+KTTBHB!OB+OPH!CMCEFEAPMO!BT!MOEIFSORMAADTQDCOCO+H+KMMSSL!HKFTL+HRRRO!QGNBTEPN!EBGPB!GCHQFFHR!LC+PKGAJ+DHTI+PSLHS+P!MQR!TJHJNSJBKQ!PGO!JQPSHL!TJQMIHHIPMDNDOPREH+SNFG!TFG!PPL!MSIB+BFD!E+RDT+Q!KT+AAGKDERM!MMKFBCNL!NEHITRKSHPH+CDNEPNLJILABCO+RD+AAEPMN!D+E+PH+A!KKKTTG!B+EBBGJG!GPHOM+KIN+NHLQ!BF+DLACHF+GBDC+ESFM!FPDD!LS+AJ+PTDIBMBREETMT+Q+B+HMDB+GN!PITBSM+CDH!SPHOQS!DNOAF!COAQTQ!RQEEBIESM!FH!FIKT!ENTCOO+ABECM+HMHL!DCABB+MMRHL+RA+PSBTPAFR!KAGJAB!C!HCLIIO+H!IS+FJEGQBEEMPRTRSSE+PQ+L!EESHLQ!RR+QTMMAT+TCB+D+DD+O!PEB+NL+ERBROKORRSOEE!NEPGRDJ!QTM+AP!GRN+NNJBKNEG!D+OHATQDTA!S+M!LTDSSNJDRP+RI+GLJPSPGTD+Q!CIHPLGCNQGSCS!ELHEIS!HO!ODHNBTANBEBQT!QRKOIID+GB+FNSOLC!QOFHDDEB+E!TTG!PD+RKB!STQIN!I!SAE!PHFPDATJQSNLM+JQF+EH!EDHGGLRAENC+TAKSJKAOPMFO!AETSDRG!B!NS!IFII+E+MK+O!RBN+GDLLC+ATRDC+G!S!PN+MDPR+BTDTSMPKTOJSP!CFFJK+CQ!AIAHPF!MSJG!EAKDSDBHMJ!LHJ!B+E+A+F+CE!JL+NA+L!P+KAT+KI!Q!JSCTBATSPTDTIPNHAESQEBT+A+DAODFFDDPAJOF+QELHIBAM!NSGJQ+INE!JR!B!ASJFOLNT+BGP+HLGTJSEIIKJMP+IRTDJTEPS!R+ENHTN!O!RG+KB!ALLCDRIGCENESEHRROR!PJDRE!JMNQL+SFLF!DS+O!AJIT!BEG+RMBNFJPKMDM+J+FCAISAC!TETARO+ON+F!QB+HOLM+KDII+PMOMBQH+ATSKDM!T!JDEBJ!RSSLDQQB+MPFMOPC!AQ!RCG!TG+BJN+KRDQLEJ+MRNIRAKRAITBMKJSG!OJHTRAGDI!DRTCN+HDKTFFBEBLEBB+P!CQEIF!BM!O!BNCF!FKRTDAQ+NILAIMSI+JQH!CGPSP!NDR+P+RP+Q+QSNJFFERAGJBCJL!KSNBPELSLFSF+DPJDM+NNTITAMA+RGKOS+AKGKTKA!S+PNAPQJCPOSEDCLKDG+SEOQDMHJLOCTLB+NNLGTOGC!AF!OS!DJ!IBME+N+CA+BSCHHOQ+DITAQ!MLASG+PRC!QNF!D!E!NOSHBKMJAI+I!O!GEJBS+P+S+MRLEINKLF+GDAAPELTD!K!F+KPERJ+ORH!KLHEJIKFD!QJHS+RRAR+MT!OSB!NKISC+S+EHKROK+GCINB+OL+M+ADF+LQOINTKQAMNK!I!D!MCE!BDMKBFN!L+B!C+EBPRMOEN!NF!ONNKE!F+GPODPERTEJNJ!OCGBKGR+JFPHIGQRE+ISH!FFSLTGE!JIPS!T!PNAKTALFTR+K+HHABKHBAJGA+IE!LJ!JKIO+TNDGNDN+RJHTQHNKOLMDK!LPHJMAA!IHK!GNBNT!LDK!IOPSCSEIGTGHEHPPLM+L+Q!MQBAOT!CR+CGMNTLAEOP+LDHJ+JLBFR+QLJMAHORIEBAHO+MHK+IMNN!TDRO!MDHD+FDDNHPL!JJTFNERHONRPTRIMSBDRPJQNEOTBIKBPEP+OAFMESNLI!OPIMOE!MDJKMF!KHLTG!LGTEPTHT+ACQ+G!T+SBAGNODRPEKKK+GSNQEATGT+M!IJBQTIDAFIBM!J!SSSP+AT+PCPCMSIHI!HQOML+NHDI+SJPM+AFJPGFO+Q!CB!ACHGSSGLCRENHRPGQFPSQJQOK!TC+QSQ!M+JKTMH!FSJDO+KC+AG!BEF+LQQQ+FGSJSBH!O!HEKBM!CGQ+LNCMSICPIHQCQERIK+K+C+B!O+FSPJHKBOGO+A+S+CQTOPBPLTGGSQLLS+IDPS!OR!CL+GGIJ+OL!TSSA+DODFSLS!OKSLPG+PPD!K!KEQHRHGB!KMOSEIM!SO!JCMOD!JEDIBKOPK+RKQLBOS+KJ+CFJNNFQMCMKQTFFD+GP!LS!OE!M!MTS+IJEBRHAJSKDQM!TA!CD+FPLOSHC!ASEQM!T+JITBSTLGF!LDKR+CMBS+GHEF+DA!MOSS!FPCRAT+BPTP!QMAMFAL!K!E+MAQ!DTPFK+OO+S!O+TKAN!ANIRFJB!EBAN!GEKNBTTLM+B!LS!SOJ+JCPN+QFSODRSC+RFIIOFGEBC!DELHRPFPRB!IOIDDQ!K!OEBABSLGFMEB+OKCHK!RG+GN+HLBDOCRBNCTKNTCHRNS!KRLLC!AO!NT!CFQJFRFMELJ+LOP+C!GRNI+OTLRHKR!ALE!DTBAGESD!E!QINETADOF!KFIMMFII!OIEPHJFG!QAJRJBAKCHSSOR+T!KRQRIG!LGKSS+OOLPJ+PKEJ!TFMNNLCE+IIFPDT+OJ+POSKG!P!LLMTHGGGJ+O!BDGOEJC!BD+NGCRLM!ECT+HHJGLSDIGF+QBRHAK+GPSEIIS+COQC!KLHHAQKCTPECITAAEGJHEFKEDM+ACKPE+BQFANOQSE+JM!IGCFEAEC!N+LH+BD+PSQHOT+S!EB+PJDNSE+MNFN+BIR!KD!QTH+G+OPA+FS!RE+KKL+TAMPAOGTKOEGGQR!OQ+HJHRT!DHR!RHJ!KINH+RB+KQMBRE+CEAGBC!JB!RBEPGFIGS+I!G!FOQFGFTDFDJCQDQ!TGE+RP!FR!MSPBSJO+RFKMM+JECRBLJOBITJJBB!HKINHQTE!DRAFS!RFMFDDN!RRHJOOBLDJRGDDPJOR!C!OG+NB!JPPG!GQJT+M+RAAHAJLOR!AJF+QHEQMI!SSRIKELBAEJ+GPK+NKP+OPDF+LB!S!ANA+N!L!NRE+DOLBCR+S+SEH!NRJC+IKILBJDAEBH!BPSQQMMFEOKOO+HISKAJEBRMF+LGHOTFTJ!TG!SNBKS!QJMGB!QQFMIMA+KIJD!N+KAIR+EKO!JGFHOG!NN+M!MA!MDNMNBJ!JG!IBIDGHEFEKQ+LNQHPN+LDG!LEJTSKNCEIFABPNMCBSPPDN+BDBLPITHDSQSCDJTNANFGIADJP+KHSLSBI!Q!FT+PQN!NRR+R!J!HBLSO+PDM!LBCIAJEKAJQSB!BTI+DQFHAI+FC+K!S+ABELLGCL+EHNNBD+TOC!JSIQGH+SSH!FODD+SMRMPNG+SOE!QFPHLJPSCAPLMIQNE+CCFPOPGHIBQEIJDKEQHRFCDH!MKKIG+RLEOMPEJAQPMQJHT+KODPORRSHNCBOANG!KG+HHN!DFJ!MBKTEMIBQNBA+SD!JEIKTO!ARHRSJJSNLA+GKBIGRLCLBEQ!JBLLBJRGFSDMLSHQAO+LGMMQDP!BPSJRNNEBQ+QK!I!ONO!Q!K+JCIHM+ADEH+J+E+HOOPOH+COBESHANTMK+TSEI!OLA+SB+I!QFQFDOOGPECKF+IJQFF+SOF+P+DC+P+S+HAATG+J+T+CTNIHQ!BJKBNSPACGSPSJKINMHAAKDOGPBM+TAELHRHDEKMQOEBNGD!OMLN!FMGG!PMI+LT!RAR+A!EAJFRHIRK!SDSAQJS!QRJ+NNRQDDCICKTTDQMBO+SFCBDQTMN!IBIKEG!RMCM!GAT+G+IM+P+LNDOEMEBDNPHH!JJEKHPLHRJ+LPLJGSM+SK!B!JSILDHGNKFQFBFNEIDNI+D!BO!FLDIGKM!SSKGJFNTGFHK+KRNJRFRSCPL!NDODADDCGJPN+LE+MFLIPLBEMNCHRQI+PG!QIETO+EJMO+K+QKAKMI+GOLQLCOSEENJ!HMD+HMD+KLADS+B+FFCBIJFDF!PANIG!AP!IPQSJO+MIHFIDJQS+C!NJJSH!JRPL+DTIM+H!FKPMSKFITFBKJJIPECPBDSOD+MPLCO+H!BFTHAM+FAI!AT+HGPA+HNTEGCM+ETEBO!HRD+PPEOLBM+AN+ESEQASIHIH!I!MFPIFLHK!MHTDBTQH!DGEBHECKSNATNSAGCL!SLEBJPGGNOJSMPLE!I+PTMTPMSTGAAAR+GDTPE+IRC!C!AS!I!IRAKGLJNEJHDQ+P!O+CF+HKSFFSCIL!I!O+H!GRCFJGDCL+RTF!FIL!HJ+JF!D!IOQS+HHPO!SPIKPRIHDQBGPABO+NP!ASGAS!BDEHR!IP+QQP+FI+FFPODG!IJKOCJ!QB+QE!FAK!IFOR!HRDEELB!FBA!IKG+RCM+DO!FFPEOEKIL!SBPEDLIPM!RB+L+NO!BASGNHQEMKNKOG!SOOEJ+MKNJJJFKER+JT!MT+HFND!QDQEA+DLSPLIMKQOIHC!JFPME!QC!D+C!T!FBFAQJFTGETQ!QNJ!SJN!S!N!OQBDBKJQSEIGDNG!TDMJEQGTH!DLFS!FBS!CR!NQK+FLTKQMJLDLN!MDRI+T+JJSE!L!GD+MK!NPPNQJ+T+ETOEF!M!FANENTFI!L";
        String s2 = "ABCA+AB!DA+D!DA+!BA+BA!C+BC!A!B+C+A+!B+CD+A+A";
        String s2_1 = "AB!DA+D!DA+!BA+ABCA+BA!C+BC!A!B+C+A+CD+A+A+!B";
        String s3 = "AB+AC+BC";
        String s3_2 = "AB+C";
        String s4 = "A!D+A!BC+A+!AB+A!D+!A!B!C+ABC+CD+A+A!D";
        String s5 = "ABC!D!EF+!ABC+!EFAB!C+FB!ECCA+BF+CAF+BF!E!A";
        String s6 = "ABC!D!E!F+!ABC+!EFAB!C+FB!ECCA+BF+CAF+BF!E!A";

        /*
        System.out.println(bdd.isReadyToEval(s1 = bdd.rewriteNegations(s1)));
        System.out.println(bdd.isReadyToEval(s2 = bdd.rewriteNegations(s2)));
        System.out.println(bdd.isReadyToEval(s3 = bdd.rewriteNegations(s3)));
        System.out.println(bdd.isReadyToEval(s4 = bdd.rewriteNegations(s4)));
        System.out.println(bdd.isReadyToEval(s5 = bdd.rewriteNegations(s5)));

        System.out.println();

        System.out.println(bdd.evaluate(s3, true));
        System.out.println(bdd.evaluate(s4, true));
        System.out.println(bdd.evaluate(s5, true));

        System.out.println();

        System.out.println(bdd.evaluate(s3, false));
        System.out.println(bdd.evaluate(s4, false));
        System.out.println(bdd.evaluate(s5, false));
        */


        start = System.nanoTime();
        //bdd.createBDD(s1, "ABCDEFGHIJKLMNOPQRST");
        //bdd.createBDD(s1_2, "ABCDEFGHIJKLMNOPQRST");
        //bdd.createBDD(s2, "ABCD");
        //bdd.createBDD(s3, "ABC");
        //bdd.createBDD(s3_2, "ABC");
        //bdd.createBDD(s4, "ABCD");
        bdd.createBDD(s5, "ABCDEF");
        //bdd.createBDD(s6, "ABCDEF");
        stop = System.nanoTime();

        bdd.printNicely(false);

        System.out.println("Number of nodes before reduction: " + bdd.getAllNodes());
        System.out.println("Number of nodes after reduction: " + bdd.getNumberOfNodes());
        System.out.println("Reduction ratio: " + bdd.getReductionRatio() + "%");
        System.out.println("Reduction duration: " + (stop-start) + " nanoseconds = " + ((stop-start)/1_000_000) + " milliseconds = " + ((stop-start)/1_000_000_000) + " seconds");
    }
}
