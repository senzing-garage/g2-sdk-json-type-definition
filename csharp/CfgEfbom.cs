// Code generated by jtd-codegen for C# + System.Text.Json v0.2.1

using System.Text.Json.Serialization;

namespace Senzing
{
    /// <summary>
    /// No description.
    /// </summary>
    public class CfgEfbom
    {
        /// <summary>
        /// No description.
        /// </summary>
        [JsonPropertyName("EFCALL_ID")]
        public int EfcallId { get; set; }

        /// <summary>
        /// No description.
        /// </summary>
        [JsonPropertyName("EXEC_ORDER")]
        public int ExecOrder { get; set; }

        /// <summary>
        /// No description.
        /// </summary>
        [JsonPropertyName("FELEM_ID")]
        public int FelemId { get; set; }

        /// <summary>
        /// No description.
        /// </summary>
        [JsonPropertyName("FELEM_REQ")]
        public string FelemReq { get; set; }

        /// <summary>
        /// No description.
        /// </summary>
        [JsonPropertyName("FTYPE_ID")]
        public int FtypeId { get; set; }
    }
}