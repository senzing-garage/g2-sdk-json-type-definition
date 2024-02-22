// Code generated by jtd-codegen for Rust v0.2.1

use chrono::{DateTime, FixedOffset};
use serde::{Deserialize, Serialize};
use serde_json::Value;

pub type Senzingapi = Option<Value>;

#[derive(Serialize, Deserialize)]
pub struct AffectedEntity {
    #[serde(rename = "ENTITY_ID")]
    pub entityId: i32,
}

#[derive(Serialize, Deserialize)]
pub struct CfgAttr {
    #[serde(rename = "ADVANCED")]
    pub advanced: String,

    #[serde(rename = "ATTR_CLASS")]
    pub attrClass: String,

    #[serde(rename = "ATTR_CODE")]
    pub attrCode: String,

    #[serde(rename = "ATTR_ID")]
    pub attrId: i32,

    #[serde(rename = "DEFAULT_VALUE")]
    pub defaultValue: String,

    #[serde(rename = "FELEM_CODE")]
    pub felemCode: String,

    #[serde(rename = "FELEM_REQ")]
    pub felemReq: String,

    #[serde(rename = "FTYPE_CODE")]
    pub ftypeCode: String,

    #[serde(rename = "INTERNAL")]
    pub internal: String,
}

#[derive(Serialize, Deserialize)]
pub struct CfgCfbom {
    #[serde(rename = "CFCALL_ID")]
    pub cfcallId: i32,

    #[serde(rename = "EXEC_ORDER")]
    pub execOrder: i32,

    #[serde(rename = "FELEM_ID")]
    pub felemId: i32,

    #[serde(rename = "FTYPE_ID")]
    pub ftypeId: i32,
}

#[derive(Serialize, Deserialize)]
pub struct CfgCfcall {
    #[serde(rename = "CFCALL_ID")]
    pub cfcallId: i32,

    #[serde(rename = "CFUNC_ID")]
    pub cfuncId: i32,

    #[serde(rename = "EXEC_ORDER")]
    pub execOrder: i32,

    #[serde(rename = "FTYPE_ID")]
    pub ftypeId: i32,
}

#[derive(Serialize, Deserialize)]
pub struct CfgCfrtn {
    #[serde(rename = "CFRTN_ID")]
    pub cfrtnId: i32,

    #[serde(rename = "CFUNC_ID")]
    pub cfuncId: i32,

    #[serde(rename = "CFUNC_RTNVAL")]
    pub cfuncRtnval: String,

    #[serde(rename = "CLOSE_SCORE")]
    pub closeScore: i32,

    #[serde(rename = "EXEC_ORDER")]
    pub execOrder: i32,

    #[serde(rename = "FTYPE_ID")]
    pub ftypeId: i32,

    #[serde(rename = "LIKELY_SCORE")]
    pub likelyScore: i32,

    #[serde(rename = "PLAUSIBLE_SCORE")]
    pub plausibleScore: i32,

    #[serde(rename = "SAME_SCORE")]
    pub sameScore: i32,

    #[serde(rename = "UN_LIKELY_SCORE")]
    pub unLikelyScore: i32,
}

#[derive(Serialize, Deserialize)]
pub struct CfgCfunc {
    #[serde(rename = "ANON_SUPPORT")]
    pub anonSupport: String,

    #[serde(rename = "CFUNC_CODE")]
    pub cfuncCode: String,

    #[serde(rename = "CFUNC_DESC")]
    pub cfuncDesc: String,

    #[serde(rename = "CFUNC_ID")]
    pub cfuncId: i32,

    #[serde(rename = "CONNECT_STR")]
    pub connectStr: String,

    #[serde(rename = "FUNC_LIB")]
    pub funcLib: String,

    #[serde(rename = "FUNC_VER")]
    pub funcVer: String,

    #[serde(rename = "JAVA_CLASS_NAME")]
    pub javaClassName: String,

    #[serde(rename = "LANGUAGE")]
    pub language: String,
}

#[derive(Serialize, Deserialize)]
pub struct CfgDfbom {
    #[serde(rename = "DFCALL_ID")]
    pub dfcallId: i32,

    #[serde(rename = "EXEC_ORDER")]
    pub execOrder: i32,

    #[serde(rename = "FELEM_ID")]
    pub felemId: i32,

    #[serde(rename = "FTYPE_ID")]
    pub ftypeId: i32,
}

#[derive(Serialize, Deserialize)]
pub struct CfgDfcall {
    #[serde(rename = "DFCALL_ID")]
    pub dfcallId: i32,

    #[serde(rename = "DFUNC_ID")]
    pub dfuncId: i32,

    #[serde(rename = "EXEC_ORDER")]
    pub execOrder: i32,

    #[serde(rename = "FTYPE_ID")]
    pub ftypeId: i32,
}

#[derive(Serialize, Deserialize)]
pub struct CfgDfunc {
    #[serde(rename = "ANON_SUPPORT")]
    pub anonSupport: String,

    #[serde(rename = "CONNECT_STR")]
    pub connectStr: String,

    #[serde(rename = "DFUNC_CODE")]
    pub dfuncCode: String,

    #[serde(rename = "DFUNC_DESC")]
    pub dfuncDesc: String,

    #[serde(rename = "DFUNC_ID")]
    pub dfuncId: i32,

    #[serde(rename = "FUNC_LIB")]
    pub funcLib: String,

    #[serde(rename = "FUNC_VER")]
    pub funcVer: String,

    #[serde(rename = "JAVA_CLASS_NAME")]
    pub javaClassName: String,

    #[serde(rename = "LANGUAGE")]
    pub language: String,
}

#[derive(Serialize, Deserialize)]
pub struct CfgDsrc {
    #[serde(rename = "CONVERSATIONAL")]
    pub conversational: String,

    #[serde(rename = "DSRC_CODE")]
    pub dsrcCode: String,

    #[serde(rename = "DSRC_DESC")]
    pub dsrcDesc: String,

    #[serde(rename = "DSRC_ID")]
    pub dsrcId: i32,

    #[serde(rename = "DSRC_RELY")]
    pub dsrcRely: i32,

    #[serde(rename = "RETENTION_LEVEL")]
    pub retentionLevel: String,
}

#[derive(Serialize, Deserialize)]
pub struct CfgDsrcInterest {
    #[serde(rename = "DSRC_ID")]
    pub dsrcId: i32,

    #[serde(rename = "INTEREST_FLAG")]
    pub interestFlag: String,

    #[serde(rename = "MAX_DEGREE")]
    pub maxDegree: i32,
}

#[derive(Serialize, Deserialize)]
pub struct CfgEbom {
    #[serde(rename = "ETYPE_ID")]
    pub etypeId: i32,

    #[serde(rename = "EXEC_ORDER")]
    pub execOrder: i32,

    #[serde(rename = "FTYPE_ID")]
    pub ftypeId: i32,

    #[serde(rename = "UTYPE_CODE")]
    pub utypeCode: String,
}

#[derive(Serialize, Deserialize)]
pub struct CfgEclass {
    #[serde(rename = "ECLASS_CODE")]
    pub eclassCode: String,

    #[serde(rename = "ECLASS_DESC")]
    pub eclassDesc: String,

    #[serde(rename = "ECLASS_ID")]
    pub eclassId: i32,

    #[serde(rename = "RESOLVE")]
    pub resolve: String,
}

#[derive(Serialize, Deserialize)]
pub struct CfgEfbom {
    #[serde(rename = "EFCALL_ID")]
    pub efcallId: i32,

    #[serde(rename = "EXEC_ORDER")]
    pub execOrder: i32,

    #[serde(rename = "FELEM_ID")]
    pub felemId: i32,

    #[serde(rename = "FELEM_REQ")]
    pub felemReq: String,

    #[serde(rename = "FTYPE_ID")]
    pub ftypeId: i32,
}

#[derive(Serialize, Deserialize)]
pub struct CfgEfcall {
    #[serde(rename = "EFCALL_ID")]
    pub efcallId: i32,

    #[serde(rename = "EFEAT_FTYPE_ID")]
    pub efeatFtypeId: i32,

    #[serde(rename = "EFUNC_ID")]
    pub efuncId: i32,

    #[serde(rename = "EXEC_ORDER")]
    pub execOrder: i32,

    #[serde(rename = "FELEM_ID")]
    pub felemId: i32,

    #[serde(rename = "FTYPE_ID")]
    pub ftypeId: i32,

    #[serde(rename = "IS_VIRTUAL")]
    pub isVirtual: String,
}

#[derive(Serialize, Deserialize)]
pub struct CfgEfunc {
    #[serde(rename = "CONNECT_STR")]
    pub connectStr: String,

    #[serde(rename = "EFUNC_CODE")]
    pub efuncCode: String,

    #[serde(rename = "EFUNC_DESC")]
    pub efuncDesc: String,

    #[serde(rename = "EFUNC_ID")]
    pub efuncId: i32,

    #[serde(rename = "FUNC_LIB")]
    pub funcLib: String,

    #[serde(rename = "FUNC_VER")]
    pub funcVer: String,

    #[serde(rename = "JAVA_CLASS_NAME")]
    pub javaClassName: String,

    #[serde(rename = "LANGUAGE")]
    pub language: String,
}

#[derive(Serialize, Deserialize)]
pub struct CfgErfrag {
    #[serde(rename = "ERFRAG_CODE")]
    pub erfragCode: String,

    #[serde(rename = "ERFRAG_DEPENDS")]
    pub erfragDepends: String,

    #[serde(rename = "ERFRAG_DESC")]
    pub erfragDesc: String,

    #[serde(rename = "ERFRAG_ID")]
    pub erfragId: i32,

    #[serde(rename = "ERFRAG_SOURCE")]
    pub erfragSource: String,
}

#[derive(Serialize, Deserialize)]
pub struct CfgErrule {
    #[serde(rename = "DISQ_ERFRAG_CODE")]
    pub disqErfragCode: String,

    #[serde(rename = "ERRULE_CODE")]
    pub erruleCode: String,

    #[serde(rename = "ERRULE_DESC")]
    pub erruleDesc: String,

    #[serde(rename = "ERRULE_ID")]
    pub erruleId: i32,

    #[serde(rename = "ERRULE_TIER")]
    pub erruleTier: i32,

    #[serde(rename = "QUAL_ERFRAG_CODE")]
    pub qualErfragCode: String,

    #[serde(rename = "REF_SCORE")]
    pub refScore: i32,

    #[serde(rename = "RELATE")]
    pub relate: String,

    #[serde(rename = "RESOLVE")]
    pub resolve: String,

    #[serde(rename = "RTYPE_ID")]
    pub rtypeId: i32,
}

#[derive(Serialize, Deserialize)]
pub struct CfgEtype {
    #[serde(rename = "ECLASS_ID")]
    pub eclassId: i32,

    #[serde(rename = "ETYPE_CODE")]
    pub etypeCode: String,

    #[serde(rename = "ETYPE_DESC")]
    pub etypeDesc: String,

    #[serde(rename = "ETYPE_ID")]
    pub etypeId: i32,
}

#[derive(Serialize, Deserialize)]
pub struct CfgFbom {
    #[serde(rename = "DERIVED")]
    pub derived: String,

    #[serde(rename = "DISPLAY_DELIM")]
    pub displayDelim: String,

    #[serde(rename = "DISPLAY_LEVEL")]
    pub displayLevel: i32,

    #[serde(rename = "EXEC_ORDER")]
    pub execOrder: i32,

    #[serde(rename = "FELEM_ID")]
    pub felemId: i32,

    #[serde(rename = "FTYPE_ID")]
    pub ftypeId: i32,
}

#[derive(Serialize, Deserialize)]
pub struct CfgFbovr {
    #[serde(rename = "ECLASS_ID")]
    pub eclassId: i32,

    #[serde(rename = "FTYPE_EXCL")]
    pub ftypeExcl: String,

    #[serde(rename = "FTYPE_FREQ")]
    pub ftypeFreq: String,

    #[serde(rename = "FTYPE_ID")]
    pub ftypeId: i32,

    #[serde(rename = "FTYPE_STAB")]
    pub ftypeStab: String,

    #[serde(rename = "UTYPE_CODE")]
    pub utypeCode: String,
}

#[derive(Serialize, Deserialize)]
pub struct CfgFclass {
    #[serde(rename = "FCLASS_CODE")]
    pub fclassCode: String,

    #[serde(rename = "FCLASS_DESC")]
    pub fclassDesc: String,

    #[serde(rename = "FCLASS_ID")]
    pub fclassId: i32,
}

#[derive(Serialize, Deserialize)]
pub struct CfgFelem {
    #[serde(rename = "DATA_TYPE")]
    pub dataType: String,

    #[serde(rename = "FELEM_CODE")]
    pub felemCode: String,

    #[serde(rename = "FELEM_DESC")]
    pub felemDesc: String,

    #[serde(rename = "FELEM_ID")]
    pub felemId: i32,

    #[serde(rename = "TOKENIZE")]
    pub tokenize: String,
}

#[derive(Serialize, Deserialize)]
pub struct CfgFtype {
    #[serde(rename = "ANONYMIZE")]
    pub anonymize: String,

    #[serde(rename = "DERIVATION")]
    pub derivation: String,

    #[serde(rename = "DERIVED")]
    pub derived: String,

    #[serde(rename = "FCLASS_ID")]
    pub fclassId: i32,

    #[serde(rename = "FTYPE_CODE")]
    pub ftypeCode: String,

    #[serde(rename = "FTYPE_DESC")]
    pub ftypeDesc: String,

    #[serde(rename = "FTYPE_EXCL")]
    pub ftypeExcl: String,

    #[serde(rename = "FTYPE_FREQ")]
    pub ftypeFreq: String,

    #[serde(rename = "FTYPE_ID")]
    pub ftypeId: i32,

    #[serde(rename = "FTYPE_STAB")]
    pub ftypeStab: String,

    #[serde(rename = "PERSIST_HISTORY")]
    pub persistHistory: String,

    #[serde(rename = "RTYPE_ID")]
    pub rtypeId: i32,

    #[serde(rename = "SHOW_IN_MATCH_KEY")]
    pub showInMatchKey: String,

    #[serde(rename = "USED_FOR_CAND")]
    pub usedForCand: String,

    #[serde(rename = "VERSION")]
    pub version: i32,
}

#[derive(Serialize, Deserialize)]
pub struct CfgGenericThreshold {
    #[serde(rename = "BEHAVIOR")]
    pub behavior: String,

    #[serde(rename = "CANDIDATE_CAP")]
    pub candidateCap: i32,

    #[serde(rename = "FTYPE_ID")]
    pub ftypeId: i32,

    #[serde(rename = "GPLAN_ID")]
    pub gplanId: i32,

    #[serde(rename = "SCORING_CAP")]
    pub scoringCap: i32,

    #[serde(rename = "SEND_TO_REDO")]
    pub sendToRedo: String,
}

#[derive(Serialize, Deserialize)]
pub struct CfgGplan {
    #[serde(rename = "GPLAN_CODE")]
    pub gplanCode: String,

    #[serde(rename = "GPLAN_DESC")]
    pub gplanDesc: String,

    #[serde(rename = "GPLAN_ID")]
    pub gplanId: i32,
}

#[derive(Serialize, Deserialize)]
pub struct CfgLens {
    #[serde(rename = "LENS_CODE")]
    pub lensCode: String,

    #[serde(rename = "LENS_DESC")]
    pub lensDesc: String,

    #[serde(rename = "LENS_ID")]
    pub lensId: i32,
}

pub type CfgLensrl = Vec<FixmeUnknown>;

#[derive(Serialize, Deserialize)]
pub struct CfgRclass {
    #[serde(rename = "IS_DISCLOSED")]
    pub isDisclosed: String,

    #[serde(rename = "RCLASS_CODE")]
    pub rclassCode: String,

    #[serde(rename = "RCLASS_DESC")]
    pub rclassDesc: String,

    #[serde(rename = "RCLASS_ID")]
    pub rclassId: i32,
}

#[derive(Serialize, Deserialize)]
pub struct CfgRtype {
    #[serde(rename = "BREAK_RES")]
    pub breakRes: String,

    #[serde(rename = "RCLASS_ID")]
    pub rclassId: i32,

    #[serde(rename = "REL_STRENGTH")]
    pub relStrength: i32,

    #[serde(rename = "RTYPE_CODE")]
    pub rtypeCode: String,

    #[serde(rename = "RTYPE_DESC")]
    pub rtypeDesc: String,

    #[serde(rename = "RTYPE_ID")]
    pub rtypeId: i32,
}

#[derive(Serialize, Deserialize)]
pub struct CfgSfcall {
    #[serde(rename = "EXEC_ORDER")]
    pub execOrder: i32,

    #[serde(rename = "FELEM_ID")]
    pub felemId: i32,

    #[serde(rename = "FTYPE_ID")]
    pub ftypeId: i32,

    #[serde(rename = "SFCALL_ID")]
    pub sfcallId: i32,

    #[serde(rename = "SFUNC_ID")]
    pub sfuncId: i32,
}

#[derive(Serialize, Deserialize)]
pub struct CfgSfunc {
    #[serde(rename = "CONNECT_STR")]
    pub connectStr: String,

    #[serde(rename = "FUNC_LIB")]
    pub funcLib: String,

    #[serde(rename = "FUNC_VER")]
    pub funcVer: String,

    #[serde(rename = "JAVA_CLASS_NAME")]
    pub javaClassName: String,

    #[serde(rename = "LANGUAGE")]
    pub language: String,

    #[serde(rename = "SFUNC_CODE")]
    pub sfuncCode: String,

    #[serde(rename = "SFUNC_DESC")]
    pub sfuncDesc: String,

    #[serde(rename = "SFUNC_ID")]
    pub sfuncId: i32,
}

#[derive(Serialize, Deserialize)]
pub struct ConfigBaseVersion {
    #[serde(rename = "BUILD_DATE")]
    pub buildDate: String,

    #[serde(rename = "BUILD_NUMBER")]
    pub buildNumber: String,

    #[serde(rename = "BUILD_VERSION")]
    pub buildVersion: String,

    #[serde(rename = "COMPATIBILITY_VERSION")]
    pub compatibilityVersion: CompatibilityVersion,

    #[serde(rename = "PRODUCT_NAME")]
    pub productName: String,

    #[serde(rename = "VERSION")]
    pub version: String,
}

#[derive(Serialize, Deserialize)]
pub struct CompatibilityVersion {
    #[serde(rename = "CONFIG_VERSION")]
    pub configVersion: String,
}

#[derive(Serialize, Deserialize)]
pub struct Config {
    #[serde(rename = "CONFIG_COMMENTS")]
    pub configComments: String,

    #[serde(rename = "CONFIG_ID")]
    pub configId: i32,

    #[serde(rename = "SYS_CREATE_DT")]
    pub sysCreateDt: String,
}

pub type Configs = Vec<Config>;

#[derive(Serialize, Deserialize)]
pub struct DataSource {
    /// The text representation of the datasource.
    #[serde(rename = "DSRC_CODE")]
    pub dsrcCode: String,

    /// The unique identifier of the datasource.
    #[serde(rename = "DSRC_ID")]
    pub dsrcId: i32,
}

#[derive(Serialize, Deserialize)]
pub struct Entity {
    #[serde(rename = "RELATED_ENTITIES")]
    pub relatedEntities: Vec<RelatedEntity>,

    #[serde(rename = "RESOLVED_ENTITY")]
    pub resolvedEntity: ResolvedEntity,
}

#[derive(Serialize, Deserialize)]
pub struct EntityPath {
    #[serde(rename = "END_ENTITY_ID")]
    pub endEntityId: i32,

    #[serde(rename = "ENTITIES")]
    pub entities: Vec<i32>,

    #[serde(rename = "START_ENTITY_ID")]
    pub startEntityId: i32,
}

#[derive(Serialize, Deserialize)]
pub struct FeatureDescriptionValue {
    #[serde(rename = "CANDIDATE_CAP_REACHED")]
    pub candidateCapReached: String,

    #[serde(rename = "ENTITY_COUNT")]
    pub entityCount: i32,

    #[serde(rename = "FEAT_DESC")]
    pub featDesc: String,

    #[serde(rename = "LIB_FEAT_ID")]
    pub libFeatId: i32,

    #[serde(rename = "SCORING_CAP_REACHED")]
    pub scoringCapReached: String,

    #[serde(rename = "SUPPRESSED")]
    pub suppressed: String,

    #[serde(rename = "USED_FOR_CAND")]
    pub usedForCand: String,

    #[serde(rename = "USED_FOR_SCORING")]
    pub usedForScoring: String,
}

#[derive(Serialize, Deserialize)]
pub struct FeatureForAttribute {
    #[serde(rename = "FEAT_DESC")]
    pub featDesc: String,

    #[serde(rename = "FEAT_DESC_VALUES")]
    pub featDescValues: Vec<FeatureDescriptionValue>,

    #[serde(rename = "LIB_FEAT_ID")]
    pub libFeatId: i32,

    #[serde(rename = "USAGE_TYPE")]
    pub usageType: String,
}

#[derive(Serialize, Deserialize)]
pub struct FeatureScoreForAttribute {
    #[serde(rename = "CANDIDATE_FEAT")]
    pub candidateFeat: String,

    #[serde(rename = "CANDIDATE_FEAT_ID")]
    pub candidateFeatId: i32,

    #[serde(rename = "CANDIDATE_FEAT_USAGE_TYPE")]
    pub candidateFeatUsageType: String,

    #[serde(rename = "FULL_SCORE")]
    pub fullScore: i32,

    #[serde(rename = "GENERATION_MATCH")]
    pub generationMatch: i32,

    #[serde(rename = "GNR_FN")]
    pub gnrFn: i32,

    #[serde(rename = "GNR_GN")]
    pub gnrGn: i32,

    #[serde(rename = "GNR_ON")]
    pub gnrOn: i32,

    #[serde(rename = "GNR_SN")]
    pub gnrSn: i32,

    #[serde(rename = "INBOUND_FEAT")]
    pub inboundFeat: String,

    #[serde(rename = "INBOUND_FEAT_ID")]
    pub inboundFeatId: i32,

    #[serde(rename = "INBOUND_FEAT_USAGE_TYPE")]
    pub inboundFeatUsageType: String,

    #[serde(rename = "SCORE_BEHAVIOR")]
    pub scoreBehavior: String,

    #[serde(rename = "SCORE_BUCKET")]
    pub scoreBucket: String,
}

pub type FeatureScores = String;

pub type FeatureScoresForAttribute = Vec<FeatureScoreForAttribute>;

#[derive(Serialize, Deserialize)]
pub struct FinalState {
    #[serde(rename = "NEED_REEVALUATION")]
    pub needReevaluation: i32,

    #[serde(rename = "VIRTUAL_ENTITIES")]
    pub virtualEntities: Vec<VirtualEntitySynopsis>,
}

pub type FixmeUnknown = String;

#[derive(Serialize, Deserialize)]
pub struct FocusRecord {
    #[serde(rename = "DATA_SOURCE")]
    pub dataSource: String,

    #[serde(rename = "RECORD_ID")]
    pub recordId: String,
}

pub type FocusRecords = Vec<FocusRecord>;

#[derive(Serialize, Deserialize)]
pub struct G2config {
    #[serde(rename = "CFG_ATTR")]
    pub cfgAttr: Vec<CfgAttr>,

    #[serde(rename = "CFG_CFBOM")]
    pub cfgCfbom: Vec<CfgCfbom>,

    #[serde(rename = "CFG_CFCALL")]
    pub cfgCfcall: Vec<CfgCfcall>,

    #[serde(rename = "CFG_CFRTN")]
    pub cfgCfrtn: Vec<CfgCfrtn>,

    #[serde(rename = "CFG_CFUNC")]
    pub cfgCfunc: Vec<CfgCfunc>,

    #[serde(rename = "CFG_DFBOM")]
    pub cfgDfbom: Vec<CfgDfbom>,

    #[serde(rename = "CFG_DFCALL")]
    pub cfgDfcall: Vec<CfgDfcall>,

    #[serde(rename = "CFG_DFUNC")]
    pub cfgDfunc: Vec<CfgDfunc>,

    #[serde(rename = "CFG_DSRC")]
    pub cfgDsrc: Vec<CfgDsrc>,

    #[serde(rename = "CFG_DSRC_INTEREST")]
    pub cfgDsrcInterest: Vec<CfgDsrcInterest>,

    #[serde(rename = "CFG_EBOM")]
    pub cfgEbom: Vec<CfgEbom>,

    #[serde(rename = "CFG_ECLASS")]
    pub cfgEclass: Vec<CfgEclass>,

    #[serde(rename = "CFG_EFBOM")]
    pub cfgEfbom: Vec<CfgEfbom>,

    #[serde(rename = "CFG_EFCALL")]
    pub cfgEfcall: Vec<CfgEfcall>,

    #[serde(rename = "CFG_EFUNC")]
    pub cfgEfunc: Vec<CfgEfunc>,

    #[serde(rename = "CFG_ERFRAG")]
    pub cfgErfrag: Vec<CfgErfrag>,

    #[serde(rename = "CFG_ERRULE")]
    pub cfgErrule: Vec<CfgErrule>,

    #[serde(rename = "CFG_ETYPE")]
    pub cfgEtype: Vec<CfgEtype>,

    #[serde(rename = "CFG_FBOM")]
    pub cfgFbom: Vec<CfgFbom>,

    #[serde(rename = "CFG_FBOVR")]
    pub cfgFbovr: Vec<CfgFbovr>,

    #[serde(rename = "CFG_FCLASS")]
    pub cfgFclass: Vec<CfgFclass>,

    #[serde(rename = "CFG_FELEM")]
    pub cfgFelem: Vec<CfgFelem>,

    #[serde(rename = "CFG_FTYPE")]
    pub cfgFtype: Vec<CfgFtype>,

    #[serde(rename = "CFG_GENERIC_THRESHOLD")]
    pub cfgGenericThreshold: Vec<CfgGenericThreshold>,

    #[serde(rename = "CFG_GPLAN")]
    pub cfgGplan: Vec<CfgGplan>,

    #[serde(rename = "CFG_LENS")]
    pub cfgLens: Vec<CfgLens>,

    #[serde(rename = "CFG_LENSRL")]
    pub cfgLensrl: Vec<CfgLensrl>,

    #[serde(rename = "CFG_RCLASS")]
    pub cfgRclass: Vec<CfgRclass>,

    #[serde(rename = "CFG_RTYPE")]
    pub cfgRtype: Vec<CfgRtype>,

    #[serde(rename = "CFG_SFCALL")]
    pub cfgSfcall: Vec<CfgSfcall>,

    #[serde(rename = "CFG_SFUNC")]
    pub cfgSfunc: Vec<CfgSfunc>,

    #[serde(rename = "CONFIG_BASE_VERSION")]
    pub configBaseVersion: ConfigBaseVersion,

    #[serde(rename = "SYS_OOM")]
    pub sysOom: Vec<SysOom>,
}

#[derive(Serialize, Deserialize)]
pub struct G2configAddDataSourceResponse {
    #[serde(rename = "DSRC_ID")]
    pub dsrcId: i32,
}

#[derive(Serialize, Deserialize)]
pub struct G2configListDataSourcesResponse {
    #[serde(rename = "DATA_SOURCES")]
    pub dataSources: Vec<DataSource>,
}

#[derive(Serialize, Deserialize)]
pub struct G2configSaveResponse {
    #[serde(rename = "G2_CONFIG")]
    pub g2Config: G2config,
}

#[derive(Serialize, Deserialize)]
pub struct G2configmgrGetConfigListResponse {
    #[serde(rename = "CONFIGS")]
    pub configs: Configs,
}

#[derive(Serialize, Deserialize)]
pub struct G2configmgrGetConfigResponse {
    #[serde(rename = "G2_CONFIG")]
    pub g2Config: G2config,
}

#[derive(Serialize, Deserialize)]
pub struct G2diagnosticCheckDbperfResponse {
    #[serde(rename = "insertTime")]
    pub insertTime: i32,

    #[serde(rename = "numRecordsInserted")]
    pub numRecordsInserted: i32,
}

pub type G2diagnosticStreamEntityListBySizeResponse = FixmeUnknown;

pub type G2engineAddRecordWithInfoResponse = WithInfo;

pub type G2engineDeleteRecordWithInfoResponse = WithInfo;

#[derive(Serialize, Deserialize)]
pub struct G2engineExportConfigAndConfigIdResponse {
    #[serde(rename = "G2_CONFIG")]
    pub g2Config: G2config,
}

#[derive(Serialize, Deserialize)]
pub struct G2engineExportConfigResponse {
    #[serde(rename = "G2_CONFIG")]
    pub g2Config: G2config,
}

pub type G2engineFetchNextResponse = FixmeUnknown;

pub type G2engineFindInterestingEntitiesByEntityIdResponse = Interesting;

pub type G2engineFindInterestingEntitiesByRecordIdResponse = Interesting;

pub type G2engineFindNetworkByEntityIdv2response = Network;

pub type G2engineFindNetworkByEntityIdResponse = Network;

pub type G2engineFindNetworkByRecordIdv2response = Network;

pub type G2engineFindNetworkByRecordIdResponse = Network;

pub type G2engineFindPathByEntityIdv2response = Path;

pub type G2engineFindPathByEntityIdResponse = Path;

pub type G2engineFindPathByRecordIdv2response = Path;

pub type G2engineFindPathByRecordIdResponse = Path;

pub type G2engineFindPathExcludingByEntityIdv2response = Path;

pub type G2engineFindPathExcludingByEntityIdResponse = Path;

pub type G2engineFindPathExcludingByRecordIdv2response = Path;

pub type G2engineFindPathExcludingByRecordIdResponse = Path;

pub type G2engineFindPathIncludingSourceByEntityIdv2response = Path;

pub type G2engineFindPathIncludingSourceByEntityIdResponse = Path;

pub type G2engineFindPathIncludingSourceByRecordIdv2response = Path;

pub type G2engineFindPathIncludingSourceByRecordIdResponse = Path;

pub type G2engineGetEntityByEntityIdv2response = Entity;

pub type G2engineGetEntityByEntityIdResponse = Entity;

pub type G2engineGetEntityByRecordIdv2response = Entity;

pub type G2engineGetEntityByRecordIdResponse = Entity;

pub type G2engineGetRecordResponse = Record;

pub type G2engineGetRecordV2response = Record;

pub type G2engineGetRedoRecordResponse = FixmeUnknown;

pub type G2engineGetVirtualEntityByRecordIdv2response = VirtualEntity;

pub type G2engineGetVirtualEntityByRecordIdResponse = VirtualEntity;

pub type G2engineHowEntityByEntityIdv2response = How;

pub type G2engineHowEntityByEntityIdResponse = How;

pub type G2engineProcessRedoRecordResponse = FixmeUnknown;

pub type G2engineProcessRedoRecordWithInfoResponse = WithInfo;

pub type G2engineReevaluateEntityWithInfoResponse = WithInfo;

pub type G2engineReevaluateRecordWithInfoResponse = WithInfo;

pub type G2engineReplaceRecordWithInfoResponse = WithInfo;

pub type G2engineSearchByAttributesResponse = Search;

pub type G2engineSearchByAttributesV2response = Search;

pub type G2engineSearchByAttributesV3response = Search;

pub type G2engineStreamExportJsonentityReportResponse = FixmeUnknown;

pub type G2engineWhyEntitiesResponse = WhyEntities;

pub type G2engineWhyEntitiesV2response = WhyEntities;

pub type G2engineWhyRecordsResponse = WhyRecords;

pub type G2engineWhyRecordsV2response = WhyRecords;

#[derive(Serialize, Deserialize)]
pub struct G2productLicenseResponse {
    #[serde(rename = "billing")]
    pub billing: String,

    #[serde(rename = "contract")]
    pub contract: String,

    #[serde(rename = "customer")]
    pub customer: String,

    #[serde(rename = "expireDate")]
    pub expireDate: String,

    #[serde(rename = "issueDate")]
    pub issueDate: String,

    #[serde(rename = "licenseLevel")]
    pub licenseLevel: String,

    #[serde(rename = "licenseType")]
    pub licenseType: String,

    #[serde(rename = "recordLimit")]
    pub recordLimit: i32,
}

#[derive(Serialize, Deserialize)]
pub struct G2productVersionResponse {
    #[serde(rename = "BUILD_DATE")]
    pub buildDate: String,

    #[serde(rename = "BUILD_NUMBER")]
    pub buildNumber: String,

    #[serde(rename = "BUILD_VERSION")]
    pub buildVersion: String,

    #[serde(rename = "COMPATIBILITY_VERSION")]
    pub compatibilityVersion: CompatibilityVersion,

    #[serde(rename = "PRODUCT_NAME")]
    pub productName: String,

    #[serde(rename = "SCHEMA_VERSION")]
    pub schemaVersion: SchemaVersion,

    #[serde(rename = "VERSION")]
    pub version: String,
}

#[derive(Serialize, Deserialize)]
pub struct How {
    #[serde(rename = "HOW_RESULTS")]
    pub howResults: HowResults,
}

#[derive(Serialize, Deserialize)]
pub struct HowResults {
    #[serde(rename = "FINAL_STATE")]
    pub finalState: FinalState,

    #[serde(rename = "RESOLUTION_STEPS")]
    pub resolutionSteps: ResolutionSteps,
}

#[derive(Serialize, Deserialize)]
pub struct Interesting {
    #[serde(rename = "INTERESTING_ENTITIES")]
    pub interestingEntities: InterestingEntities,
}

#[derive(Serialize, Deserialize)]
pub struct InterestingEntities {
    #[serde(rename = "ENTITIES")]
    pub entities: Vec<InterestingEntity>,

    #[serde(rename = "NOTICES")]
    pub notices: Notices,
}

#[derive(Serialize, Deserialize)]
pub struct InterestingEntitySampleRecords {
    #[serde(rename = "DATA_SOURCE")]
    pub dataSource: String,

    #[serde(rename = "FLAGS")]
    pub flags: Vec<String>,

    #[serde(rename = "RECORD_ID")]
    pub recordId: String,
}

#[derive(Serialize, Deserialize)]
pub struct InterestingEntity {
    #[serde(rename = "DEGREES")]
    pub degrees: i32,

    #[serde(rename = "ENTITY_ID")]
    pub entityId: i32,

    #[serde(rename = "FLAGS")]
    pub flags: Vec<String>,

    #[serde(rename = "SAMPLE_RECORDS")]
    pub sampleRecords: Vec<InterestingEntitySampleRecords>,
}

#[derive(Serialize, Deserialize)]
pub struct MatchInfoDisclosedRelationsRelAnchor {
    #[serde(rename = "DOMAIN")]
    pub domain: String,

    #[serde(rename = "FEAT_DESC")]
    pub featDesc: String,

    #[serde(rename = "FEAT_ID")]
    pub featId: i32,

    #[serde(rename = "LINKED_FEAT_DESC")]
    pub linkedFeatDesc: String,

    #[serde(rename = "LINKED_FEAT_ID")]
    pub linkedFeatId: i32,

    #[serde(rename = "LINKED_FEAT_TYPE")]
    pub linkedFeatType: String,

    #[serde(rename = "LINKED_FEAT_USAGE_TYPE")]
    pub linkedFeatUsageType: String,
}

#[derive(Serialize, Deserialize)]
pub struct MatchInfoDisclosedRelationsRelLink {
    #[serde(rename = "DOMAIN")]
    pub domain: String,

    #[serde(rename = "FEAT_DESC")]
    pub featDesc: String,

    #[serde(rename = "FEAT_ID")]
    pub featId: i32,

    #[serde(rename = "FEAT_USAGE_TYPE")]
    pub featUsageType: String,

    #[serde(rename = "LINKED_FEAT_DESC")]
    pub linkedFeatDesc: String,

    #[serde(rename = "LINKED_FEAT_ID")]
    pub linkedFeatId: i32,

    #[serde(rename = "LINKED_FEAT_TYPE")]
    pub linkedFeatType: String,

    #[serde(rename = "LINKED_FEAT_USAGE_TYPE")]
    pub linkedFeatUsageType: String,
}

#[derive(Serialize, Deserialize)]
pub struct MatchInfoDisclosedRelationsRelPointer {
    #[serde(rename = "DOMAIN")]
    pub domain: String,

    #[serde(rename = "FEAT_DESC")]
    pub featDesc: String,

    #[serde(rename = "FEAT_ID")]
    pub featId: i32,

    #[serde(rename = "FEAT_USAGE_TYPE")]
    pub featUsageType: String,

    #[serde(rename = "LINKED_FEAT_DESC")]
    pub linkedFeatDesc: String,

    #[serde(rename = "LINKED_FEAT_ID")]
    pub linkedFeatId: i32,

    #[serde(rename = "LINKED_FEAT_TYPE")]
    pub linkedFeatType: String,
}

#[derive(Serialize, Deserialize)]
pub struct MatchInfoDisclosedRelations {
    #[serde(rename = "REL_ANCHOR")]
    pub relAnchor: Vec<MatchInfoDisclosedRelationsRelAnchor>,

    #[serde(rename = "REL_LINK")]
    pub relLink: Vec<MatchInfoDisclosedRelationsRelLink>,

    #[serde(rename = "REL_POINTER")]
    pub relPointer: Vec<MatchInfoDisclosedRelationsRelPointer>,
}

#[derive(Serialize, Deserialize)]
pub struct MatchInfo {
    #[serde(rename = "CANDIDATE_KEYS")]
    pub candidateKeys: MatchInfoCandidateKeys,

    #[serde(rename = "DISCLOSED_RELATIONS")]
    pub disclosedRelations: MatchInfoDisclosedRelations,

    #[serde(rename = "ERRULE_CODE")]
    pub erruleCode: String,

    #[serde(rename = "FEATURE_SCORES")]
    pub featureScores: FeatureScores,

    #[serde(rename = "MATCH_KEY")]
    pub matchKey: String,

    #[serde(rename = "MATCH_LEVEL")]
    pub matchLevel: i32,

    #[serde(rename = "MATCH_LEVEL_CODE")]
    pub matchLevelCode: String,

    #[serde(rename = "WHY_ERRULE_CODE")]
    pub whyErruleCode: String,

    #[serde(rename = "WHY_KEY")]
    pub whyKey: String,
}

pub type MatchInfoCandidateKeys = String;

#[derive(Serialize, Deserialize)]
pub struct MatchInfoForAttribute {
    #[serde(rename = "FEAT_DESC")]
    pub featDesc: String,

    #[serde(rename = "FEAT_ID")]
    pub featId: i32,
}

#[derive(Serialize, Deserialize)]
pub struct MemberRecord {
    #[serde(rename = "INTERNAL_ID")]
    pub internalId: i32,

    #[serde(rename = "RECORDS")]
    pub records: Records,
}

pub type MemberRecords = Vec<MemberRecord>;

#[derive(Serialize, Deserialize)]
pub struct Network {
    #[serde(rename = "ENTITIES")]
    pub entities: Vec<Entity>,

    #[serde(rename = "ENTITY_PATHS")]
    pub entityPaths: Vec<EntityPath>,

    #[serde(rename = "MAX_ENTITY_LIMIT_REACHED")]
    pub maxEntityLimitReached: String,
}

#[derive(Serialize, Deserialize)]
pub struct Notice {
    #[serde(rename = "CODE")]
    pub code: String,

    #[serde(rename = "DESCRIPTION")]
    pub description: String,
}

pub type Notices = Vec<Notice>;

#[derive(Serialize, Deserialize)]
pub struct Path {
    #[serde(rename = "ENTITIES")]
    pub entities: Vec<Entity>,

    #[serde(rename = "ENTITY_PATHS")]
    pub entityPaths: Vec<EntityPath>,
}

#[derive(Serialize, Deserialize)]
pub struct RecordFeatures {
    #[serde(rename = "LIB_FEAT_ID")]
    pub libFeatId: i32,

    #[serde(rename = "USAGE_TYPE")]
    pub usageType: String,
}

#[derive(Serialize, Deserialize)]
pub struct Record {
    #[serde(rename = "ADDRESS_DATA")]
    pub addressData: Vec<String>,

    #[serde(rename = "ATTRIBUTE_DATA")]
    pub attributeData: Vec<String>,

    #[serde(rename = "DATA_SOURCE")]
    pub dataSource: String,

    #[serde(rename = "ENTITY_DATA")]
    pub entityData: Vec<String>,

    #[serde(rename = "ENTITY_DESC")]
    pub entityDesc: String,

    #[serde(rename = "ENTITY_KEY")]
    pub entityKey: String,

    #[serde(rename = "ENTITY_TYPE")]
    pub entityType: String,

    #[serde(rename = "ERRULE_CODE")]
    pub erruleCode: String,

    #[serde(rename = "FEATURES")]
    pub features: Vec<RecordFeatures>,

    #[serde(rename = "IDENTIFIER_DATA")]
    pub identifierData: Vec<String>,

    #[serde(rename = "INTERNAL_ID")]
    pub internalId: i32,

    #[serde(rename = "JSON_DATA")]
    pub jsonData: String,

    #[serde(rename = "LAST_SEEN_DT")]
    pub lastSeenDt: DateTime<FixedOffset>,

    #[serde(rename = "MATCH_KEY")]
    pub matchKey: String,

    #[serde(rename = "MATCH_LEVEL")]
    pub matchLevel: i32,

    #[serde(rename = "MATCH_LEVEL_CODE")]
    pub matchLevelCode: String,

    #[serde(rename = "NAME_DATA")]
    pub nameData: Vec<String>,

    #[serde(rename = "OTHER_DATA")]
    pub otherData: Vec<String>,

    #[serde(rename = "PHONE_DATA")]
    pub phoneData: Vec<String>,

    #[serde(rename = "RECORD_ID")]
    pub recordId: String,

    #[serde(rename = "RELATIONSHIP_DATA")]
    pub relationshipData: Vec<String>,
}

#[derive(Serialize, Deserialize)]
pub struct RecordSummaryElement {
    #[serde(rename = "DATA_SOURCE")]
    pub dataSource: String,

    #[serde(rename = "FIRST_SEEN_DT")]
    pub firstSeenDt: DateTime<FixedOffset>,

    #[serde(rename = "LAST_SEEN_DT")]
    pub lastSeenDt: DateTime<FixedOffset>,

    #[serde(rename = "RECORD_COUNT")]
    pub recordCount: i32,
}

pub type Records = Vec<Record>;

#[derive(Serialize, Deserialize)]
pub struct RelatedEntity {
    #[serde(rename = "ENTITY_ID")]
    pub entityId: i32,

    #[serde(rename = "ENTITY_NAME")]
    pub entityName: String,

    #[serde(rename = "ERRULE_CODE")]
    pub erruleCode: String,

    #[serde(rename = "IS_AMBIGUOUS")]
    pub isAmbiguous: i32,

    #[serde(rename = "IS_DISCLOSED")]
    pub isDisclosed: i32,

    #[serde(rename = "LAST_SEEN_DT")]
    pub lastSeenDt: DateTime<FixedOffset>,

    #[serde(rename = "MATCH_KEY")]
    pub matchKey: String,

    #[serde(rename = "MATCH_LEVEL")]
    pub matchLevel: i32,

    #[serde(rename = "MATCH_LEVEL_CODE")]
    pub matchLevelCode: String,

    #[serde(rename = "RECORDS")]
    pub records: Records,

    #[serde(rename = "RECORD_SUMMARY")]
    pub recordSummary: Vec<RecordSummaryElement>,
}

#[derive(Serialize, Deserialize)]
pub struct ResolutionStep {
    #[serde(rename = "INBOUND_VIRTUAL_ENTITY_ID")]
    pub inboundVirtualEntityId: String,

    #[serde(rename = "MATCH_INFO")]
    pub matchInfo: MatchInfo,

    #[serde(rename = "RESULT_VIRTUAL_ENTITY_ID")]
    pub resultVirtualEntityId: String,

    #[serde(rename = "STEP")]
    pub step: i32,

    #[serde(rename = "VIRTUAL_ENTITY_1")]
    pub virtualEntity: VirtualEntitySynopsis,

    #[serde(rename = "VIRTUAL_ENTITY_2")]
    pub virtualEntity0: VirtualEntitySynopsis,
}

pub type ResolutionSteps = Vec<ResolutionStep>;

#[derive(Serialize, Deserialize)]
pub struct ResolvedEntity {
    #[serde(rename = "ENTITY_ID")]
    pub entityId: i32,

    #[serde(rename = "ENTITY_NAME")]
    pub entityName: String,

    #[serde(rename = "ERRULE_CODE")]
    pub erruleCode: String,

    #[serde(rename = "FEATURES")]
    pub features: String,

    #[serde(rename = "IS_AMBIGUOUS")]
    pub isAmbiguous: i32,

    #[serde(rename = "IS_DISCLOSED")]
    pub isDisclosed: i32,

    #[serde(rename = "LAST_SEEN_DT")]
    pub lastSeenDt: DateTime<FixedOffset>,

    #[serde(rename = "MATCH_KEY")]
    pub matchKey: String,

    #[serde(rename = "MATCH_LEVEL")]
    pub matchLevel: i32,

    #[serde(rename = "MATCH_LEVEL_CODE")]
    pub matchLevelCode: String,

    #[serde(rename = "RECORDS")]
    pub records: Records,

    #[serde(rename = "RECORD_SUMMARY")]
    pub recordSummary: Vec<RecordSummaryElement>,
}

#[derive(Serialize, Deserialize)]
pub struct ResolvedEntityAndMatchInfoEntity {
    #[serde(rename = "RESOLVED_ENTITY")]
    pub resolvedEntity: ResolvedEntity,
}

#[derive(Serialize, Deserialize)]
pub struct ResolvedEntityAndMatchInfo {
    #[serde(rename = "ENTITY")]
    pub entity: ResolvedEntityAndMatchInfoEntity,

    #[serde(rename = "MATCH_INFO")]
    pub matchInfo: MatchInfo,
}

#[derive(Serialize, Deserialize)]
pub struct SysOom {
    #[serde(rename = "FELEM_ID")]
    pub felemId: i32,

    #[serde(rename = "FTYPE_ID")]
    pub ftypeId: i32,

    #[serde(rename = "LENS_ID")]
    pub lensId: i32,

    #[serde(rename = "LIB_FEAT_ID")]
    pub libFeatId: i32,

    #[serde(rename = "LIB_FELEM_ID")]
    pub libFelemId: i32,

    #[serde(rename = "NEXT_THRESH")]
    pub nextThresh: i32,

    #[serde(rename = "OOM_LEVEL")]
    pub oomLevel: String,

    #[serde(rename = "OOM_TYPE")]
    pub oomType: String,

    #[serde(rename = "THRESH1_CNT")]
    pub thresh1Cnt: i32,

    #[serde(rename = "THRESH1_OOM")]
    pub thresh1Oom: i32,
}

#[derive(Serialize, Deserialize)]
pub struct SchemaVersion {
    #[serde(rename = "ENGINE_SCHEMA_VERSION")]
    pub engineSchemaVersion: String,

    #[serde(rename = "MAXIMUM_REQUIRED_SCHEMA_VERSION")]
    pub maximumRequiredSchemaVersion: String,

    #[serde(rename = "MINIMUM_REQUIRED_SCHEMA_VERSION")]
    pub minimumRequiredSchemaVersion: String,
}

#[derive(Serialize, Deserialize)]
pub struct Search {
    #[serde(rename = "RESOLVED_ENTITIES")]
    pub resolvedEntities: Vec<ResolvedEntityAndMatchInfo>,

    #[serde(rename = "SEARCH_STATISTICS")]
    pub searchStatistics: SearchStatistics,
}

#[derive(Serialize, Deserialize)]
pub struct SearchStatisticCandidateKeysFeatureTypes {
    #[serde(rename = "FOUND")]
    pub found: i32,

    #[serde(rename = "FTYPE_CODE")]
    pub ftypeCode: String,

    #[serde(rename = "GENERIC")]
    pub generic: i32,

    #[serde(rename = "NOT_FOUND")]
    pub notFound: i32,
}

#[derive(Serialize, Deserialize)]
pub struct SearchStatisticCandidateKeysSummary {
    #[serde(rename = "FOUND")]
    pub found: i32,

    #[serde(rename = "GENERIC")]
    pub generic: i32,

    #[serde(rename = "NOT_FOUND")]
    pub notFound: i32,
}

#[derive(Serialize, Deserialize)]
pub struct SearchStatisticCandidateKeys {
    #[serde(rename = "FEATURE_TYPES")]
    pub featureTypes: Vec<SearchStatisticCandidateKeysFeatureTypes>,

    #[serde(rename = "SUMMARY")]
    pub summary: SearchStatisticCandidateKeysSummary,
}

#[derive(Serialize, Deserialize)]
pub struct SearchStatistic {
    #[serde(rename = "CANDIDATE_KEYS")]
    pub candidateKeys: SearchStatisticCandidateKeys,
}

pub type SearchStatistics = Vec<SearchStatistic>;

#[derive(Serialize, Deserialize)]
pub struct VirtualEntity {
    #[serde(rename = "RESOLVED_ENTITY")]
    pub resolvedEntity: ResolvedEntity,
}

#[derive(Serialize, Deserialize)]
pub struct VirtualEntitySynopsis {
    #[serde(rename = "MEMBER_RECORDS")]
    pub memberRecords: MemberRecords,

    #[serde(rename = "VIRTUAL_ENTITY_ID")]
    pub virtualEntityId: String,
}

#[derive(Serialize, Deserialize)]
pub struct WhyEntities {
    #[serde(rename = "ENTITIES")]
    pub entities: Vec<Entity>,

    #[serde(rename = "WHY_RESULTS")]
    pub whyResults: WhyResults,
}

#[derive(Serialize, Deserialize)]
pub struct WhyRecords {
    #[serde(rename = "ENTITIES")]
    pub entities: Vec<Entity>,

    #[serde(rename = "WHY_RESULTS")]
    pub whyResults: WhyResults,
}

#[derive(Serialize, Deserialize)]
pub struct WhyResult {
    #[serde(rename = "ENTITY_ID")]
    pub entityId: i32,

    #[serde(rename = "ENTITY_ID_2")]
    pub entityId0: i32,

    #[serde(rename = "FOCUS_RECORDS")]
    pub focusRecords: FocusRecords,

    #[serde(rename = "FOCUS_RECORDS_2")]
    pub focusRecords0: FocusRecords,

    #[serde(rename = "INTERNAL_ID")]
    pub internalId: i32,

    #[serde(rename = "INTERNAL_ID_2")]
    pub internalId0: i32,

    #[serde(rename = "MATCH_INFO")]
    pub matchInfo: MatchInfo,
}

pub type WhyResults = Vec<WhyResult>;

#[derive(Serialize, Deserialize)]
pub struct WithInfo {
    #[serde(rename = "AFFECTED_ENTITIES")]
    pub affectedEntities: Vec<AffectedEntity>,

    #[serde(rename = "DATA_SOURCE")]
    pub dataSource: String,

    #[serde(rename = "INTERESTING_ENTITIES")]
    pub interestingEntities: InterestingEntities,

    #[serde(rename = "RECORD_ID")]
    pub recordId: String,
}
