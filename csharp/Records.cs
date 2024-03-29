// Code generated by jtd-codegen for C# + System.Text.Json v0.2.1

using System;
using System.Collections.Generic;
using System.Text.Json;
using System.Text.Json.Serialization;

namespace Senzing
{
    [JsonConverter(typeof(RecordsJsonConverter))]
    public class Records
    {
        /// <summary>
        /// The underlying data being wrapped.
        /// </summary>
        public IList<Record> Value { get; set; }
    }

    public class RecordsJsonConverter : JsonConverter<Records>
    {
        public override Records Read(ref Utf8JsonReader reader, Type typeToConvert, JsonSerializerOptions options)
        {
            return new Records { Value = JsonSerializer.Deserialize<IList<Record>>(ref reader, options) };
        }

        public override void Write(Utf8JsonWriter writer, Records value, JsonSerializerOptions options)
        {
            JsonSerializer.Serialize<IList<Record>>(writer, value.Value, options);
        }
    }
}
