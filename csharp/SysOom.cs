// Code generated by jtd-codegen for C# + System.Text.Json v0.2.1

using System.Text.Json.Serialization;

namespace Senzing
{
    /// <summary>
    /// No description.
    /// </summary>
    public class SysOom
    {
        /// <summary>
        /// No description.
        /// </summary>
        [JsonPropertyName("FELEM_ID")]
        public int FelemId { get; set; }

        /// <summary>
        /// No description.
        /// </summary>
        [JsonPropertyName("FTYPE_ID")]
        public int FtypeId { get; set; }

        /// <summary>
        /// No description.
        /// </summary>
        [JsonPropertyName("LENS_ID")]
        public int LensId { get; set; }

        /// <summary>
        /// No description.
        /// </summary>
        [JsonPropertyName("LIB_FEAT_ID")]
        public int LibFeatId { get; set; }

        /// <summary>
        /// No description.
        /// </summary>
        [JsonPropertyName("LIB_FELEM_ID")]
        public int LibFelemId { get; set; }

        /// <summary>
        /// No description.
        /// </summary>
        [JsonPropertyName("NEXT_THRESH")]
        public int NextThresh { get; set; }

        /// <summary>
        /// No description.
        /// </summary>
        [JsonPropertyName("OOM_LEVEL")]
        public string OomLevel { get; set; }

        /// <summary>
        /// No description.
        /// </summary>
        [JsonPropertyName("OOM_TYPE")]
        public string OomType { get; set; }

        /// <summary>
        /// No description.
        /// </summary>
        [JsonPropertyName("THRESH1_CNT")]
        public int Thresh1Cnt { get; set; }

        /// <summary>
        /// No description.
        /// </summary>
        [JsonPropertyName("THRESH1_OOM")]
        public int Thresh1Oom { get; set; }
    }
}
