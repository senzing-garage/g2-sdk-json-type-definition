// Code generated by jtd-codegen for C# + System.Text.Json v0.2.1

using System.Text.Json.Serialization;

namespace Senzing
{
    /// <summary>
    /// No description.
    /// </summary>
    public class ResolutionStep
    {
        /// <summary>
        /// No description.
        /// </summary>
        [JsonPropertyName("INBOUND_VIRTUAL_ENTITY_ID")]
        public string InboundVirtualEntityId { get; set; }

        /// <summary>
        /// No description.
        /// </summary>
        [JsonPropertyName("MATCH_INFO")]
        public MatchInfo MatchInfo { get; set; }

        /// <summary>
        /// No description.
        /// </summary>
        [JsonPropertyName("RESULT_VIRTUAL_ENTITY_ID")]
        public string ResultVirtualEntityId { get; set; }

        /// <summary>
        /// No description.
        /// </summary>
        [JsonPropertyName("STEP")]
        public int Step { get; set; }

        /// <summary>
        /// No description.
        /// </summary>
        [JsonPropertyName("VIRTUAL_ENTITY_1")]
        public VirtualEntitySynopsis VirtualEntity { get; set; }

        /// <summary>
        /// No description.
        /// </summary>
        [JsonPropertyName("VIRTUAL_ENTITY_2")]
        public VirtualEntitySynopsis VirtualEntity0 { get; set; }
    }
}
