// Code generated by jtd-codegen for C# + System.Text.Json v0.2.1

using System.Text.Json.Serialization;

namespace Senzing
{
    public class DiagnosticFetchNextEntityBySizeResponse0
    {
        /// <summary>
        /// No description.
        /// </summary>
        [JsonPropertyName("DSRC_CODE")]
        public string DsrcCode { get; set; }

        /// <summary>
        /// No description.
        /// </summary>
        [JsonPropertyName("ENT_SRC_DESC")]
        public string EntSrcDesc { get; set; }

        /// <summary>
        /// No description.
        /// </summary>
        [JsonPropertyName("ENT_SRC_KEY")]
        public string EntSrcKey { get; set; }

        /// <summary>
        /// No description.
        /// </summary>
        [JsonPropertyName("ERRULE_CODE")]
        public string ErruleCode { get; set; }

        /// <summary>
        /// No description.
        /// </summary>
        [JsonPropertyName("ER_ID")]
        public int ErId { get; set; }

        /// <summary>
        /// No description.
        /// </summary>
        [JsonPropertyName("ETYPE_CODE")]
        public string EtypeCode { get; set; }

        /// <summary>
        /// No description.
        /// </summary>
        [JsonPropertyName("JSON_DATA")]
        public JsonData JsonData { get; set; }

        /// <summary>
        /// No description.
        /// </summary>
        [JsonPropertyName("MATCH_KEY")]
        public string MatchKey { get; set; }

        /// <summary>
        /// No description.
        /// </summary>
        [JsonPropertyName("OBS_ENT_ID")]
        public int ObsEntId { get; set; }

        /// <summary>
        /// No description.
        /// </summary>
        [JsonPropertyName("RECORD_ID")]
        public string RecordId { get; set; }

        /// <summary>
        /// No description.
        /// </summary>
        [JsonPropertyName("RES_ENT_ID")]
        public int ResEntId { get; set; }
    }
}
