// Code generated by jtd-codegen for C# + System.Text.Json v0.2.1

using System.Text.Json.Serialization;

namespace Senzing
{
    public class CfgRclass
    {
        [JsonPropertyName("IS_DISCLOSED")]
        public string IsDisclosed { get; set; }

        [JsonPropertyName("RCLASS_CODE")]
        public string RclassCode { get; set; }

        [JsonPropertyName("RCLASS_DESC")]
        public string RclassDesc { get; set; }

        [JsonPropertyName("RCLASS_ID")]
        public int RclassId { get; set; }
    }
}
