// Code generated by jtd-codegen for C# + System.Text.Json v0.2.1

using System.Text.Json.Serialization;

namespace Senzing
{
    public class CfgFtype
    {
        [JsonPropertyName("ANONYMIZE")]
        public string Anonymize { get; set; }

        [JsonPropertyName("DERIVATION")]
        public string Derivation { get; set; }

        [JsonPropertyName("DERIVED")]
        public string Derived { get; set; }

        [JsonPropertyName("FCLASS_ID")]
        public int FclassId { get; set; }

        [JsonPropertyName("FTYPE_CODE")]
        public string FtypeCode { get; set; }

        [JsonPropertyName("FTYPE_DESC")]
        public string FtypeDesc { get; set; }

        [JsonPropertyName("FTYPE_EXCL")]
        public string FtypeExcl { get; set; }

        [JsonPropertyName("FTYPE_FREQ")]
        public string FtypeFreq { get; set; }

        [JsonPropertyName("FTYPE_ID")]
        public int FtypeId { get; set; }

        [JsonPropertyName("FTYPE_STAB")]
        public string FtypeStab { get; set; }

        [JsonPropertyName("PERSIST_HISTORY")]
        public string PersistHistory { get; set; }

        [JsonPropertyName("RTYPE_ID")]
        public int RtypeId { get; set; }

        [JsonPropertyName("SHOW_IN_MATCH_KEY")]
        public string ShowInMatchKey { get; set; }

        [JsonPropertyName("USED_FOR_CAND")]
        public string UsedForCand { get; set; }

        [JsonPropertyName("VERSION")]
        public int Version_ { get; set; }
    }
}
