// Code generated by jtd-codegen for C# + System.Text.Json v0.2.1

using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Senzing
{
    /// <summary>
    /// No description.
    /// </summary>
    public class FinalState
    {
        /// <summary>
        /// No description.
        /// </summary>
        [JsonPropertyName("NEED_REEVALUATION")]
        public int NeedReevaluation { get; set; }

        /// <summary>
        /// No description.
        /// </summary>
        [JsonPropertyName("VIRTUAL_ENTITIES")]
        public IList<VirtualEntitySynopsis> VirtualEntities { get; set; }
    }
}
