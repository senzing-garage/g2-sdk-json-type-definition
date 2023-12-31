// Code generated by jtd-codegen for C# + System.Text.Json v0.2.1

using System;
using System.Collections.Generic;
using System.Text.Json;
using System.Text.Json.Serialization;

namespace Senzing
{
    /// <summary>
    /// No description.
    /// </summary>
    [JsonConverter(typeof(CfgLensrlJsonConverter))]
    public class CfgLensrl
    {
        /// <summary>
        /// The underlying data being wrapped.
        /// </summary>
        public IList<object> Value { get; set; }
    }

    public class CfgLensrlJsonConverter : JsonConverter<CfgLensrl>
    {
        public override CfgLensrl Read(ref Utf8JsonReader reader, Type typeToConvert, JsonSerializerOptions options)
        {
            return new CfgLensrl { Value = JsonSerializer.Deserialize<IList<object>>(ref reader, options) };
        }

        public override void Write(Utf8JsonWriter writer, CfgLensrl value, JsonSerializerOptions options)
        {
            JsonSerializer.Serialize<IList<object>>(writer, value.Value, options);
        }
    }
}
